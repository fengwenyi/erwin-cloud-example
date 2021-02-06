package com.fengwenyi.example.erwincloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Erwin Feng
 * @since 2021-02-06
 */
@SpringBootApplication
@EnableConfigServer
public class ErwinCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErwinCloudConfigApplication.class, args);
    }

}
