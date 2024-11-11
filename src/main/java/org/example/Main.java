package org.example;

//import org.example.aop.AppConfig;
//import org.example.aop.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
//@ComponentScan(basePackages = "org.example.aop")
public class Main  {



    public static void main(String[] args) {
        //

        ApplicationContext context = SpringApplication.run(Main.class, args);

//        B proxy = (B) context.getBean(B.class);
//
//        proxy.aopT();

//
//        // 获取代理对象
//        MyService proxy = (MyService) context.getBean("myServiceProxy");
//        proxy.myMethod(); // 应该会触发 before advice
    }


}