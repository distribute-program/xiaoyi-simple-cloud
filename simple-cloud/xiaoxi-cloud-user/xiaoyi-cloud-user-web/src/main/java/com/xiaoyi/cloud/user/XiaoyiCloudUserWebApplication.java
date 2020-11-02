package com.xiaoyi.cloud.user;

import com.xiaoyi.cloud.user.config.SwaggerDocConfig;
import com.xiaoyi.cloud.user.config.XxlJobConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({SwaggerDocConfig.class, XxlJobConfig.class})
@MapperScan("com.xiaoyi.cloud.user.mapper")
public class XiaoyiCloudUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoyiCloudUserWebApplication.class, args);
    }

}
