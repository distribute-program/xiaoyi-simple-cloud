package com.xiaoyi.cloud.user.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author yuanLong Wei
 * @version 1.0.0
 * @ClassName XxlJobDemo.java
 * @Description XXLJOB测试用例
 * @createTime 2020年03月26日 14:14:00
 * @updateBy
 * @updateTime
 */
@Component
@Slf4j
public class XxlJobDemo {

    @XxlJob(value = "testJobHandler")
    public ReturnT<String> testJobHandler(String s) {
        log.info("xxljob执行了");
        return ReturnT.SUCCESS;
    }

}
