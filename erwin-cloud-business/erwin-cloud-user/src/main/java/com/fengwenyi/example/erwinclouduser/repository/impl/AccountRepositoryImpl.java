package com.fengwenyi.example.erwinclouduser.repository.impl;

import com.fengwenyi.example.erwinclouduser.entity.AccountEntity;
import com.fengwenyi.example.erwinclouduser.mapper.IAccountMapper;
import com.fengwenyi.example.erwinclouduser.repository.MPAccountRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Erwin Feng
 * @since 2021-03-08
 */
@Service
public class AccountRepositoryImpl extends ServiceImpl<IAccountMapper, AccountEntity> implements MPAccountRepository {

}
