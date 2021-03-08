package com.fengwenyi.example.erwincloudorder.controller;

import com.fengwenyi.api.result.ResultTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/create")
    public ResultTemplate<?> create() {
        return ResultTemplate.success();
    }

}
