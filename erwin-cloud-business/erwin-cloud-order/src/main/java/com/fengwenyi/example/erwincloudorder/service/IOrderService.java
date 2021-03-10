package com.fengwenyi.example.erwincloudorder.service;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwincloudorder.vo.OrderRequestVo;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
public interface IOrderService {

    /**
     * 创建订单
     * @param requestVo
     * @return
     */
    ResultTemplate<Void> create(OrderRequestVo requestVo);


    ResultTemplate<Void> updateStatus(Long orderId);
}
