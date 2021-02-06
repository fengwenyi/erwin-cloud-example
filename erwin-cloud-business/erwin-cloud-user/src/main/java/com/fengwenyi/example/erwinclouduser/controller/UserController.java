package com.fengwenyi.example.erwinclouduser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Erwin Feng
 * @since 2021-02-06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserName")
    public String getUserName() {
        return "Zhangsan";
    }

}
