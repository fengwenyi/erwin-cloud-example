package com.fengwenyi.example.erwinclouduser.api;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwinclouduser.service.IAccountService;
import com.fengwenyi.example.erwinclouduser.vo.AccountResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@RestController
public class AccountApiImpl implements IAccountApi {

    @Autowired
    private IAccountService accountService;

    @Override
    public ResultTemplate<AccountResponseVo> query(@PathVariable Long accountId) {
        return accountService.findById(accountId);
    }
}
