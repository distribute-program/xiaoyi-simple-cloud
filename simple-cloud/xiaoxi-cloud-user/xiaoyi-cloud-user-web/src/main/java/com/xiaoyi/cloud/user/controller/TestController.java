package com.xiaoyi.cloud.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName TestController.java
 * @Description TODO
 * @createTime 2020年03月13日 16:03:00
 * @updateBy
 * @updateTime
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "你好 SPRING CLOUD！";
    }

}
