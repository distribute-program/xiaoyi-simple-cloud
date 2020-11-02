package com.xiaoyi.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("com.xiaoyi.cloud.user.client")
@SpringBootApplication
public class XiaoyiCloudOrderWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyiCloudOrderWebApplication.class, args);
    }

}
