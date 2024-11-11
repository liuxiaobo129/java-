package org.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component  // 标注为 Spring Bean，确保被扫描
public class LoggingAspect {

    // 定义一个 Pointcut，匹配 org.example.service 包下所有方法
    @Pointcut("execution(* org.example.service.*.*(..))")
    public void serviceLayer() {
        // Pointcut signature 方法，方法体可以为空
    }

    // 在匹配的方法执行之前执行
    @Before("serviceLayer()")
    public void beforeServiceMethod() {
        System.out.println("Before method execution");
    }

    // 在匹配的方法成功返回结果之后执行
    @AfterReturning("serviceLayer()")
    public void afterReturningServiceMethod() {
        System.out.println("After successful method execution");
    }

    // 在匹配的方法抛出异常之后执行
    @AfterThrowing("serviceLayer()")
    public void afterThrowingServiceMethod() {
        System.out.println("After method throws exception");
    }
}