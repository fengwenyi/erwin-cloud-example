package com.fengwenyi.example.erwincloudstorage.service;

import com.fengwenyi.api.result.ResultTemplate;

/**
 * @author Erwin Feng
 * @since 2021-03-10
 */
public interface IStorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    ResultTemplate<Void> decrease(Long productId, Integer count);

}
