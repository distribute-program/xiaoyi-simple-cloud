package com.xiaoyi.cloud.order.feign;

import com.xiaoyi.cloud.user.client.dto.ProductDto;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName ProductFeign.java
 * @Description TODO
 * @createTime 2020年03月15日 17:30:00
 * @updateBy
 * @updateTime
 */
public interface ProductFeign {

    /**
     * @Description 根据商品ID获取商品
     * @Param 
     * @Return 
     * @Author yuanLong Wei
     * @Date 2020/3/25 17:15
     */
    ProductDto getProductById(Integer productId);

    String getSysPort();

}
