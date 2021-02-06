package com.fengwenyi.example.erwinclouduser;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Erwin Feng
 * @since 2021-02-06
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ErwinCloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErwinCloudUserApplication.class, args);
    }

    @Value("${name}")
    private String name;

    @RequestMapping("/demo")
    public String demo() {
        return name;
    }

}
