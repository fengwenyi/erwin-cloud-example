package com.fengwenyi.example.erwincloudstorage.entity;

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
 * @since 2021-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("storage")
public class StorageEntity extends Model<StorageEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 产品id
     */
    @TableField("product_id")
    private Long productId;

    /**
     * 总库存
     */
    @TableField("total")
    private Integer total;

    /**
     * 已用库存
     */
    @TableField("used")
    private Integer used;

    /**
     * 剩余库存
     */
    @TableField("residue")
    private Integer residue;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
