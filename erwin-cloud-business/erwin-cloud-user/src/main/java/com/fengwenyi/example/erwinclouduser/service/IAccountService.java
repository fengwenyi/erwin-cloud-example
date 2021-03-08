package com.fengwenyi.example.erwinclouduser.service;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwinclouduser.vo.AccountResponseVo;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
public interface IAccountService {

    ResultTemplate<AccountResponseVo> findById(Long id);

}
