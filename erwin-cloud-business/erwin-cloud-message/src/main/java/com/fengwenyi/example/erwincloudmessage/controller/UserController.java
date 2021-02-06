package com.fengwenyi.example.erwincloudmessage.controller;

import com.fengwenyi.api.result.ResultTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Erwin Feng
 * @since 2021-02-06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("name")
    public String name() {
        return restTemplate.getForEntity("http://erwin-cloud-user/user/getUserName", String.class).getBody();
    }

}
