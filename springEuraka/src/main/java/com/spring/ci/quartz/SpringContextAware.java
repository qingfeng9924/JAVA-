package com.spring.ci.quartz;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author zhangyuan [zhang.yuan@unisinsight.com]
 * @company
 * @date 2018/12/22 17:13
 * @since 1.0
 */
@Component
@EnableAsync
public class SpringContextAware implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void publishEvent(ApplicationEvent applicationEvent){
        applicationContext.publishEvent(applicationEvent);
    }
}
