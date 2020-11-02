package com.xiaoyi.cloud.user.client;

import com.xiaoyi.cloud.user.client.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName ProductClient.java
 * @Description TODO
 * @createTime 2020年03月14日 22:52:00
 * @updateBy
 * @updateTime
 */
@FeignClient(name = "cloud-user")
public interface ProductClient {

    @RequestMapping(value = "/cloud-user/product/getProductById", method = RequestMethod.GET)
    ProductDto getProductById(@RequestParam("productId") Integer productId);

    @RequestMapping(value = "/cloud-user/product/getSysPort", method = RequestMethod.GET)
    String getSysPort();

}
