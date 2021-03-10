package com.fengwenyi.example.erwinclouduser.service;

import com.fengwenyi.api.result.ResultTemplate;

import java.math.BigDecimal;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
public interface IAccountService {

    /**
     * 扣减金额
     * @param userId
     * @param money
     * @return
     */
    ResultTemplate<Void> decrease(Long userId, BigDecimal money);
}
