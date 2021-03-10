package com.fengwenyi.example.erwincloudstorage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwincloudstorage.entity.StorageEntity;
import com.fengwenyi.example.erwincloudstorage.repository.MPStorageRepository;
import com.fengwenyi.example.erwincloudstorage.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Erwin Feng
 * @since 2021-03-10
 */
@Service
public class StorageServiceImpl implements IStorageService {

    @Autowired
    private MPStorageRepository mpStorageRepository;

    @Override
    public ResultTemplate<Void> decrease(Long productId, Integer count) {
        LambdaQueryWrapper<StorageEntity> queryWrapper =
                new LambdaQueryWrapper<StorageEntity>()
                        .eq(StorageEntity::getProductId, productId);
        List<StorageEntity> storageEntityList = mpStorageRepository.list(queryWrapper);
        if (CollectionUtils.isEmpty(storageEntityList) || storageEntityList.size() != 1) {
            return ResultTemplate.fail("商品没有库存 或者 商品库存数据异常");
        }
        StorageEntity storageEntity = storageEntityList.get(0);
        Integer total = storageEntity.getTotal();
        if (total < count) {
            return ResultTemplate.fail("商品库存不足");
        }
        storageEntity.setTotal(total - count);
        storageEntity.setUsed(storageEntity.getUsed() + count);
        boolean update = mpStorageRepository.updateById(storageEntity);
        if (update) {
            return ResultTemplate.success();
        }
        return ResultTemplate.fail("扣减商品库存失败");
    }
}
