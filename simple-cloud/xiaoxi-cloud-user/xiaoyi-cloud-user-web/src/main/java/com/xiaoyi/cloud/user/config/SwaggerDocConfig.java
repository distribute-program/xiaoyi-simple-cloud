package com.xiaoyi.cloud.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019-07-22 15:08:45
 * @description：swagger初始化参数
 * @modified By：
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "xiaoyi-cloud.doc")
@Component
@Data
public class SwaggerDocConfig {

    /** project name */
    private String apiName;

    /** document description */
    private String description;

    /** document title */
    private String title;

    /** document author */
    private String author;

    /** document version */
    private String version;

    /** index html */
    @NotBlank
    private String url;

    /** authpr email */
    private String email;

    /** group name */
    private String groupName;

}
