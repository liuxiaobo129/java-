package org.example.aop;

import jakarta.annotation.PostConstruct;
import org.example.A;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }

//    @Bean(name = "myServiceProxy")
//    public ProxyFactoryBean myServiceProxy(MyService myService, CustomPointcutAdvisor advisor) {
//        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//        proxyFactoryBean.setTarget(myService);
//        proxyFactoryBean.addAdvisor(advisor);
//        proxyFactoryBean.setProxyTargetClass(true);
//        return proxyFactoryBean;
//    }
//
//    @Bean
//    public CustomPointcutAdvisor customPointcutAdvisor() {
//
//        return new CustomPointcutAdvisor("myMethod", new MethodBeforeAdvice() {
//            @Override
//            public void before(Method method, Object[] args, Object target) throws Throwable {
//                System.out.println("Before executing: " + method.getName());
//            }
//        });
//    }

}