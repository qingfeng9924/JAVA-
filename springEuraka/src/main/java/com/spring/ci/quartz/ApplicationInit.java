package com.spring.ci.quartz;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： h3c-bj-park
 * @Date : 2019/2/14 10:27
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class ApplicationInit implements ApplicationRunner {

    /**
     * 基于内存的quartz调度需要在项目启动后启用
     *
     * @param args
     * @throws Exception
     */

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
