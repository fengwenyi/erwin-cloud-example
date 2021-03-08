package com.fengwenyi.example.erwincloudorder.vo;

import lombok.Data;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@Data
public class OrderRequestVo {

    private Long accountId;

    private Long productId;

    private Integer count;

}
