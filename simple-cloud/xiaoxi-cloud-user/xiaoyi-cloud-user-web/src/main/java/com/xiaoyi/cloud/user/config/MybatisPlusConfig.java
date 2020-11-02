package com.xiaoyi.cloud.user.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName MybatisPlusConfig.java
 * @Description mybatis开启分页
 * @createTime 2019年08月07日 16:57:00
 * @updateBy
 * @updateTime
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.xiaoyi.cloud.user.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // paginationInterceptor.setLimit(你的最大单页限制数量，默认 500 条，小于 0 如 -1 不受限制);
        Properties properties = new Properties();
        properties.setProperty("format", "true");
        paginationInterceptor.setProperties(properties);
        return paginationInterceptor;
    }

}
