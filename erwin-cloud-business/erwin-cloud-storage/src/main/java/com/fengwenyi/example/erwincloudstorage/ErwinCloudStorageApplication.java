package com.fengwenyi.example.erwincloudstorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Erwin Feng
 * @since 2021-03-09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ErwinCloudStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErwinCloudStorageApplication.class, args);
    }

}
