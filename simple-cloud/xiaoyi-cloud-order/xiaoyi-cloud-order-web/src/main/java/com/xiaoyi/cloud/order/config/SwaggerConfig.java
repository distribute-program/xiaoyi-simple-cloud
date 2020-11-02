package com.xiaoyi.cloud.order.config;

import cn.hutool.core.util.NetUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 10:40
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
@EnableSwagger2
@Slf4j
public class SwaggerConfig {

    @Resource
    private Environment env;

    @Resource
    private SwaggerDocConfig swaggerDocConfig;

    /**
     * 添加摘要信息(Docket)
     */
    @Bean
    public Docket initConfigApi() {
        String localhostAdd = NetUtil.getLocalhostStr();
        String serverPort = env.getProperty("server.port");
        String applicationName = env.getProperty("spring.application.name");
        String contextPath = env.getProperty("server.servlet.context-path");
        if(contextPath == null || "/".equals(contextPath))
            contextPath = "";

        log.info("- - - - - -  {}的文档地址为：http://{}:{}{}/doc.html - - - - - - -",applicationName,localhostAdd,serverPort,contextPath);

        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title(swaggerDocConfig.getTitle());
        apiInfoBuilder.description(swaggerDocConfig.getDescription());
        apiInfoBuilder.contact(new Contact(swaggerDocConfig.getAuthor(), swaggerDocConfig.getUrl(), swaggerDocConfig.getEmail()));
        apiInfoBuilder.version(swaggerDocConfig.getVersion());
        docket.apiInfo(apiInfoBuilder.build());
        docket.groupName(swaggerDocConfig.getGroupName());
        docket.select().apis(RequestHandlerSelectors.basePackage("com.xiaoyi.cloud.order.controller")).paths(PathSelectors.any()).build();
        return docket;
    }

}
