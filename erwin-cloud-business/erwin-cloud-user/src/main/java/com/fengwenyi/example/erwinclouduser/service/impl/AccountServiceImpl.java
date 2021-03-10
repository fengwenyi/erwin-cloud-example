package com.fengwenyi.example.erwinclouduser.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwinclouduser.entity.AccountEntity;
import com.fengwenyi.example.erwinclouduser.repository.MPAccountRepository;
import com.fengwenyi.example.erwinclouduser.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private MPAccountRepository mpAccountRepository;

    @Override
    public ResultTemplate<Void> decrease(Long userId, BigDecimal money) {
        LambdaQueryWrapper<AccountEntity> lambdaQueryWrapper =
                new LambdaQueryWrapper<AccountEntity>()
                        .eq(AccountEntity::getUserId, userId);
        List<AccountEntity> accountEntityList = mpAccountRepository.list(lambdaQueryWrapper);
        if (CollectionUtils.isEmpty(accountEntityList) || accountEntityList.size() != 1) {
            return ResultTemplate.fail("用户没有账户 或者 用户账户异常");
        }
        AccountEntity accountEntity = accountEntityList.get(0);
        accountEntity.setResidue(accountEntity.getResidue().subtract(money));
        accountEntity.setUsed(accountEntity.getUsed().add(money));
        boolean update = mpAccountRepository.updateById(accountEntity);
        if (update) {
            return ResultTemplate.success();
        }
        return ResultTemplate.fail("账户扣减金额更新失败");
    }
}
