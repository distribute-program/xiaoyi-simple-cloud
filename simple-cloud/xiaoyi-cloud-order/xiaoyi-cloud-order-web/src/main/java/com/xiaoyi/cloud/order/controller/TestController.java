package com.xiaoyi.cloud.order.controller;

import com.xiaoyi.cloud.user.client.dto.ProductDto;
import com.xiaoyi.cloud.order.feign.ProductFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName TestController.java
 * @Description TODO
 * @createTime 2020年03月14日 23:51:00
 * @updateBy
 * @updateTime
 */
@RestController
@Api(value = "客户端测试前端控制器", tags = "客户端测试前端控制器")
public class TestController {

    @Resource
    private ProductFeign productFeign;

    @GetMapping("testOne")
    @ApiOperation(value = "测试feign接口调用",notes = "测试feign接口调用")
    public ProductDto testOne(Integer productId) {
        ProductDto productById = productFeign.getProductById(productId);
        return productById;
    }

    @GetMapping("getServeSysPort")
    @ApiOperation(value = "获取服务端服务端口号",notes = "获取服务端服务端口号")
    public String getServeSysPort() {
        return productFeign.getSysPort();
    }

}
