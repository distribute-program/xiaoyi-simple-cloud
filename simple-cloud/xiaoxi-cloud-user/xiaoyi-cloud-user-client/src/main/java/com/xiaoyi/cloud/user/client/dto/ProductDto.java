package com.xiaoyi.cloud.user.client.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.math.BigDecimal;
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
public class ProductDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;

    /**
     * 产品编号
     */
    private String productNo;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 原价
     */
    private BigDecimal price;

    /**
     * 产品期限
     */
    private Integer life;

    /**
     * 最低购买期限
     */
    private Integer minLife;

    /**
     * 最多购买期限
     */
    private Integer maxLife;

    /**
     * 产品详情
     */
    private String description;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 是否删除 0：未删除 1：已删除
     */
    private Boolean isDelete;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Long updateUser;

    /**
     * 修改日期
     */
    private Date updateTime;

}
