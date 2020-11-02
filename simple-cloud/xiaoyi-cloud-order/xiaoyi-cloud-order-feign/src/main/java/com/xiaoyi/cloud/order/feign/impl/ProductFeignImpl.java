package com.xiaoyi.cloud.order.feign.impl;

import com.xiaoyi.cloud.user.client.dto.ProductDto;
import com.xiaoyi.cloud.user.client.ProductClient;
import com.xiaoyi.cloud.order.feign.ProductFeign;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName ProductFeignImpl.java
 * @Description 远程服务调用数据处理服务
 * @createTime 2020年03月15日 18:34:00
 * @updateBy
 * @updateTime
 */
@Service
public class ProductFeignImpl implements ProductFeign {

    @Resource
    private ProductClient productClient;

    @Override
    public ProductDto getProductById(Integer productId) {
        return productClient.getProductById(productId);
    }

    @Override
    public String getSysPort() {
        return "获取服务端的端口为：" + productClient.getSysPort();
    }

}
