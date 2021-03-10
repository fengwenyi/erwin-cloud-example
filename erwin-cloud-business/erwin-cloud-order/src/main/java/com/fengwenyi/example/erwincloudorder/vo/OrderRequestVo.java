package com.fengwenyi.example.erwincloudorder.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@Data
public class OrderRequestVo {

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

}
