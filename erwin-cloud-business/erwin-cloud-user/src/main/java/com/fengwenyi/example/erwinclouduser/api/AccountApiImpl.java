package com.fengwenyi.example.erwinclouduser.api;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwinclouduser.service.IAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@RestController
@Slf4j
public class AccountApiImpl implements IAccountApi {

    @Autowired
    private IAccountService accountService;

    @Override
    public ResultTemplate<Void> decrease(Long userId, BigDecimal money) {
        log.info("--------------->扣减金额开始");
        ResultTemplate<Void> resultTemplate = accountService.decrease(userId, money);
        log.info("--------------->扣减金额开始");
        return resultTemplate;
    }
}
