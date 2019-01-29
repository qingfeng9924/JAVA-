package com.spring.ci.euraka.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/1/28 9:35
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
@Aspect
@Component
public class TestAop {

    @Pointcut("@annotation(com.spring.ci.euraka.Test.Test)")
    public void pointCut(){
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        Object[] object = joinPoint.getArgs();
        String [] methods = ((MethodSignature)joinPoint.getSignature()).getParameterNames();
        System.out.println("hello");
    }
}
