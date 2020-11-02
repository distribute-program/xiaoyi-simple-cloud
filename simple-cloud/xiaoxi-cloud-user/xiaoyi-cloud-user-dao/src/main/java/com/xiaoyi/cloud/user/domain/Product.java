package com.xiaoyi.cloud.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 产品表
 * </p>
 *
 * @author yuanLong Wei
 * @since 2020-03-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 产品编号
     */
    @TableField("product_no")
    private String productNo;

    /**
     * 产品名称
     */
    @TableField("product_name")
    private String productName;

    /**
     * 原价
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 产品期限
     */
    @TableField("life")
    private Integer life;

    /**
     * 最低购买期限
     */
    @TableField("min_life")
    private Integer minLife;

    /**
     * 最多购买期限
     */
    @TableField("max_life")
    private Integer maxLife;

    /**
     * 产品详情
     */
    @TableField("description")
    private String description;

    /**
     * 状态
     */
    @TableField("status")
    private Boolean status;

    /**
     * 是否删除 0：未删除 1：已删除
     */
    @TableField("is_delete")
    private Boolean isDelete;

    /**
     * 创建人
     */
    @TableField("create_user")
    private Long createUser;

    /**
     * 创建日期
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 修改人
     */
    @TableField("update_user")
    private Long updateUser;

    /**
     * 修改日期
     */
    @TableField("update_time")
    private Date updateTime;


}
