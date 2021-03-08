package com.fengwenyi.example.erwinclouduser.api;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwinclouduser.vo.AccountResponseVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@RequestMapping("/account")
public interface IAccountApi {

    @GetMapping("/query/{accountId}")
    ResultTemplate<AccountResponseVo> query(@PathVariable Long accountId);

}
