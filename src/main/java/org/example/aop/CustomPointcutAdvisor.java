package org.example.aop;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.MethodBeforeAdvice;

public class CustomPointcutAdvisor extends AbstractPointcutAdvisor {

    private final Pointcut pointcut;
    private final MethodBeforeAdvice advice;

    public CustomPointcutAdvisor(String methodName, MethodBeforeAdvice advice) {
        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
        pointcut.setMappedName(methodName);
        this.pointcut = pointcut;
        this.advice = advice;
    }

    @Override
    public Pointcut getPointcut() {
        return this.pointcut;
    }

    @Override
    public MethodBeforeAdvice getAdvice() {
        return this.advice;
    }
}