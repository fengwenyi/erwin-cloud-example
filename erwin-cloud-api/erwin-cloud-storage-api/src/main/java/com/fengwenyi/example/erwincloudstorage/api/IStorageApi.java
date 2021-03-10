package com.fengwenyi.example.erwincloudstorage.api;

import com.fengwenyi.api.result.ResultTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Erwin Feng
 * @since 2021-03-09
 */
@RequestMapping("/storage-api")
public interface IStorageApi {

    // 根据产品ID减存储
    @GetMapping("/decrease")
    ResultTemplate<Void> decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
