package com.fengwenyi.example.erwincloudorder.service.impl;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwincloudorder.entity.OrderEntity;
import com.fengwenyi.example.erwincloudorder.entity.enums.OrderStatusEnum;
import com.fengwenyi.example.erwincloudorder.feign.IAccountFeignClient;
import com.fengwenyi.example.erwincloudorder.feign.IStorageFeignClient;
import com.fengwenyi.example.erwincloudorder.repository.MPOrderRepository;
import com.fengwenyi.example.erwincloudorder.service.IOrderService;
import com.fengwenyi.example.erwincloudorder.vo.OrderRequestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@Service
@Slf4j
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private MPOrderRepository mpOrderRepository;

    @Autowired
    private IStorageFeignClient storageFeignClient;

    @Autowired
    private IAccountFeignClient accountFeignClient;

    @Override
    //@GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public ResultTemplate<Void> create(OrderRequestVo requestVo) {

        log.info("--------------->交易开始");

        // 构建订单
        OrderEntity orderEntity = buildOrderEntity(requestVo);

        // 创建订单
        createOrder(orderEntity);

        // 扣减库存
        log.info("--------------->远程扣减库存开始-order");
        decreaseStorage(orderEntity.getProductId(), orderEntity.getCount());
        log.info("--------------->远程扣减库存结束-order");

        log.info("--------------->交易结束");

        return ResultTemplate.success();
    }

    @Override
    public ResultTemplate<Void> updateStatus(Long orderId) {
        OrderEntity orderEntity = mpOrderRepository.getById(orderId);
        if (Objects.isNull(orderEntity)) {
            return ResultTemplate.fail("订单ID无效");
        }

        // 更新订单状态
        updateOrderPayStatus(orderEntity);

        // 扣减金额
        decreaseAccount(orderEntity.getUserId(), orderEntity.getMoney());

        return ResultTemplate.success();
    }

    private void decreaseAccount(Long userId, BigDecimal money) {
        ResultTemplate<Void> resultTemplate = accountFeignClient.decrease(userId, money);
        if (!resultTemplate.getSuccess()) {
            throw new RuntimeException(resultTemplate.getMessage());
        }
    }

    private OrderEntity buildOrderEntity(OrderRequestVo requestVo) {
        return new OrderEntity()
                .setProductId(requestVo.getProductId())
                .setCount(requestVo.getCount())
                .setMoney(requestVo.getMoney())
                .setStatus(OrderStatusEnum.TO_PAY)
                .setUserId(requestVo.getUserId())
                ;
    }

    private void createOrder(OrderEntity orderEntity) {
        boolean save = mpOrderRepository.save(orderEntity);
        if (!save) {
            throw new RuntimeException("订单保存失败");
        }
    }

    private void decreaseStorage(Long productId, Integer count) {
        ResultTemplate<Void> resultTemplate = storageFeignClient.decrease(productId, count);
        if (!resultTemplate.getSuccess()) {
            throw new RuntimeException(resultTemplate.getMessage());
        }
    }

    private void updateOrderPayStatus(OrderEntity orderEntity) {
        orderEntity.setStatus(OrderStatusEnum.PAYED);
        boolean update = mpOrderRepository.updateById(orderEntity);
        if (update) {
            throw new RuntimeException("订单状态更新失败");
        }
    }
}
