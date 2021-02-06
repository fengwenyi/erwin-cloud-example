package com.fengwenyi.example.erwincloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Erwin Feng
 * @since 2021-02-06
 */
@SpringBootApplication
@EnableEurekaServer
public class ErwinCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErwinCloudEurekaApplication.class, args);
    }

}
