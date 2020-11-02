package com.xiaoyi.cloud.user.controller;

import com.xiaoyi.cloud.user.domain.Product;
import com.xiaoyi.cloud.user.service.IProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 产品表 前端控制器
 * </p>
 *
 * @author yuanLong Wei
 * @since 2020-03-14
 */
@RestController
@RequestMapping("/product")
@Api(value = "产品前端控制器", tags = "产品前端控制器")
public class ProductController {

    @Value("${server.port}")
    private String servePort;

    @Resource
    private IProductService productService;

    @ApiOperation(value = "根据商品ID获取商品详情", notes = "根据商品ID获取商品详情")
    @GetMapping("getProductById")
    public Product getProductById(Integer productId) {
        ArrayList products = new ArrayList();
        return productService.getById(productId);
    }

    @ApiOperation(value = "获取系统端口号", notes = "获取系统端口号")
    @GetMapping("getSysPort")
    public String getSysPort() {
        return servePort;
    }


}
