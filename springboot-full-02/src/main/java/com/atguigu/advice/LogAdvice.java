package com.atguigu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: LogAdvice
 * Package: com.atguigu.advice
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/24 17:31
 * @Version 1.0
 */
@Component
@Aspect
@Order(5)
public class LogAdvice {
    @Before("execution(* com..service.*.*(..))")
    public void before(JoinPoint point){
        String className = point.getTarget().getClass().getSimpleName();
        String methodName = point.getSignature().getName();
        System.out.println(className+"::"+methodName+" 开始执行了！");
    }
}
