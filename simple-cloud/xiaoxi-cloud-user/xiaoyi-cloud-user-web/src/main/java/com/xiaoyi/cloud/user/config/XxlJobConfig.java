package com.xiaoyi.cloud.user.config;

import cn.hutool.core.util.NetUtil;
import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2020年3月26日13:43:22
 * @description：XxlJob初始化参数
 * @modified By：
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "xxl.job")
@Component
@Data
@Slf4j
public class XxlJobConfig {

    private String adminAddresses;

    private String appName;

    private String ip;

    private int port;

    private String accessToken;

    private String logPath;

    private int logRetentionDays;


}
