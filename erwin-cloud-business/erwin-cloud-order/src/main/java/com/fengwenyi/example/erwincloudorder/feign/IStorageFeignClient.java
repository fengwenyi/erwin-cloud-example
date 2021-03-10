package com.fengwenyi.example.erwincloudorder.feign;

import com.fengwenyi.example.erwincloudstorage.api.IStorageApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Erwin Feng
 * @since 2021-03-09
 */
@FeignClient(name = "erwin-cloud-storage")
public interface IStorageFeignClient extends IStorageApi {
}
