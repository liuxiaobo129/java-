package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Component
public class A {
    private  B b;

    // 通过构造方法注入依赖
//    @Autowired
//    public A(B b) {
//        this.b = b;
//    }

    @Autowired
    public void setB(B b) {
        this.b = b;
//        AbstractAutoProxyCreator
    }

    // Getters and other methods
}


interface  C {

    public void c();
}

interface  D  extends C{

    public void d();
}


class F implements C{

    @Override
    public void c() {

    }
}

class G implements D{

    @Override
    public void d() {

    }

    @Override
    public void c() {

    }
}