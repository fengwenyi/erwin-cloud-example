package com.fengwenyi.example.erwincloudorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ErwinCloudOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErwinCloudOrderApplication.class, args);
    }

}
