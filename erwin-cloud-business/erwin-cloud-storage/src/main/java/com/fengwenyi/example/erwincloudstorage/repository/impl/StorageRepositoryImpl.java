package com.fengwenyi.example.erwincloudstorage.repository.impl;

import com.fengwenyi.example.erwincloudstorage.entity.StorageEntity;
import com.fengwenyi.example.erwincloudstorage.dao.IStorageDao;
import com.fengwenyi.example.erwincloudstorage.repository.MPStorageRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Erwin Feng
 * @since 2021-03-09
 */
@Service
public class StorageRepositoryImpl extends ServiceImpl<IStorageDao, StorageEntity> implements MPStorageRepository {

}
