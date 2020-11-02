package com.xiaoyi.cloud.user.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName XxlJobBenInit.java
 * @Description XXLJOB实例初始化
 * @createTime 2020年03月26日 14:52:00
 * @updateBy
 * @updateTime
 */
@Component
@Slf4j
public class XxlJobBenInit {

    @Resource
    private XxlJobConfig xxlJobConfig;

    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        log.info(">>>>>>>>>>> xxl-job config init...");
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(xxlJobConfig.getAdminAddresses());
        xxlJobSpringExecutor.setAppName(xxlJobConfig.getAppName());
        xxlJobSpringExecutor.setIp(xxlJobConfig.getIp());
        xxlJobSpringExecutor.setPort(xxlJobConfig.getPort());
        xxlJobSpringExecutor.setAccessToken(xxlJobConfig.getAccessToken());
        xxlJobSpringExecutor.setLogPath(xxlJobConfig.getLogPath());
        xxlJobSpringExecutor.setLogRetentionDays(xxlJobConfig.getLogRetentionDays());
        return xxlJobSpringExecutor;
    }

}
