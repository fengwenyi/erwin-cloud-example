package com.fengwenyi.example.erwincloudstorage.api;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwincloudstorage.service.IStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Erwin Feng
 * @since 2021-03-09
 */
@RestController
@Slf4j
public class StorageApiImpl implements IStorageApi {

    @Autowired
    private IStorageService storageService;

    @Override
    public ResultTemplate<Void> decrease(Long productId, Integer count) {
        log.info("--------------->扣减库存开始");
        ResultTemplate<Void> resultTemplate = storageService.decrease(productId, count);
        log.info("--------------->扣减库存开始");
        return resultTemplate;
    }
}
