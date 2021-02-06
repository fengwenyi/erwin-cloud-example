package com.fengwenyi.example.erwincloudadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Erwin Feng
 * @since 2021-02-06
 */
@SpringBootApplication
@EnableAdminServer
public class ErwinCloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErwinCloudAdminApplication.class, args);
    }

}
