package com.fengwenyi.example.erwincloudorder.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Erwin Feng
 * @since 2021-03-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order")
public class OrderEntity extends Model<OrderEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 产品id
     */
    @TableField("product_id")
    private Long productId;

    /**
     * 数量
     */
    @TableField("count")
    private Integer count;

    /**
     * 金额
     */
    @TableField("money")
    private BigDecimal money;

    /**
     * 订单状态。0：待支付；1：已支付。
     */
    @TableField("status")
    private Boolean status;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
