package com.fengwenyi.example.erwinclouduser.service.impl;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwinclouduser.entity.AccountEntity;
import com.fengwenyi.example.erwinclouduser.repository.MPAccountRepository;
import com.fengwenyi.example.erwinclouduser.service.IAccountService;
import com.fengwenyi.example.erwinclouduser.vo.AccountResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private MPAccountRepository mpAccountRepository;

    @Override
    public ResultTemplate<AccountResponseVo> findById(Long id) {
        AccountEntity accountEntity = mpAccountRepository.getById(id);
        if (Objects.isNull(accountEntity)) {
            return ResultTemplate.fail();
        }

        return ResultTemplate.success(accountEntity);
    }
}
