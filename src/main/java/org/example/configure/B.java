package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;


@Component
@EnableAsync
public class B {
    private A a;

    // 通过构造方法注入依赖
//    @Autowired
//    public B(A a) {
//        this.a = a;
//    }


    @Autowired
    public void setA(A a) {
        this.a = a;
    }

    @Async
    public void aopT(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        System.out.println(Thread.currentThread().getName());
    }

    // Getters and other methods
}