package com.fengwenyi.example.erwincloudorder.feign;

import com.fengwenyi.example.erwinclouduser.api.IAccountApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Erwin Feng
 * @since 2021-03-09
 */
@FeignClient(name = "erwin-cloud-user")
public interface IAccountFeignClient extends IAccountApi {
}
