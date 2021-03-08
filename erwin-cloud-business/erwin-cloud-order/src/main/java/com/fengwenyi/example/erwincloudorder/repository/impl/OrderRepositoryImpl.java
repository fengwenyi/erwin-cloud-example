package com.fengwenyi.example.erwincloudorder.repository.impl;

import com.fengwenyi.example.erwincloudorder.entity.OrderEntity;
import com.fengwenyi.example.erwincloudorder.mapper.IOrderMapper;
import com.fengwenyi.example.erwincloudorder.repository.MPOrderRepository;
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
public class OrderRepositoryImpl extends ServiceImpl<IOrderMapper, OrderEntity> implements MPOrderRepository {

}
