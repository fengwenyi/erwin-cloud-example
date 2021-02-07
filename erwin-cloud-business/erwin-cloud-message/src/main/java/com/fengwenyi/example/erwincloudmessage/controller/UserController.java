package com.fengwenyi.example.erwincloudmessage.controller;

import com.fengwenyi.api.result.ResultTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Erwin Feng
 * @since 2021-02-06
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("name")
    public String name(HttpServletRequest request) {
        log.info("message service, traceId={}, spanId={}", request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
        return restTemplate.getForEntity("http://erwin-cloud-user/user/getUserName", String.class).getBody();
    }

}
