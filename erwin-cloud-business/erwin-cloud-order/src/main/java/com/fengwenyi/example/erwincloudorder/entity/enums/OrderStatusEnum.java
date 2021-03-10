package com.fengwenyi.example.erwincloudorder.entity.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import lombok.Getter;

/**
 * @author Erwin Feng
 * @since 2021-03-09
 */
@Getter
public enum OrderStatusEnum implements IEnum<Integer> {
    TO_PAY(0, "待支付"),
    PAYED(1, "已支付")
    ;

    private final Integer code;

    private final String desc;

    OrderStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return this.code;
    }
}
