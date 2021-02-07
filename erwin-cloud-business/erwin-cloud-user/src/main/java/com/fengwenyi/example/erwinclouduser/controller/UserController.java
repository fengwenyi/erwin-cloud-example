package com.fengwenyi.example.erwinclouduser.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Erwin Feng
 * @since 2021-02-06
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @GetMapping("/getUserName")
    public String getUserName(HttpServletRequest request) {
        log.info("user service, traceId={}, spanId={}", request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
        return "Zhangsan";
    }

}
