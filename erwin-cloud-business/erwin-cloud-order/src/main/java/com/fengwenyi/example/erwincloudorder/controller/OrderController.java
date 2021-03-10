package com.fengwenyi.example.erwincloudorder.controller;

import com.fengwenyi.api.result.ResultTemplate;
import com.fengwenyi.example.erwincloudorder.service.IOrderService;
import com.fengwenyi.example.erwincloudorder.vo.OrderRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    // 创建订单
    @PostMapping("/create")
    public ResultTemplate<Void> create(@RequestBody OrderRequestVo requestVo) {
        return orderService.create(requestVo);
    }

    // 修改状态
    @GetMapping("/updateStatus")
    public ResultTemplate<Void> updateStatus(Long orderId) {
        return orderService.updateStatus(orderId);
    }

}
