package com.fengwenyi.example.erwinclouduser.entity;

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
@TableName("account")
public class AccountEntity extends Model<AccountEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 总额度
     */
    @TableField("total")
    private BigDecimal total;

    /**
     * 已用余额
     */
    @TableField("used")
    private BigDecimal used;

    /**
     * 剩余可用额度
     */
    @TableField("residue")
    private BigDecimal residue;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
