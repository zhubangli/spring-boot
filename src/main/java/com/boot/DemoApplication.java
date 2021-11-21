package com.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//启用事务管理器
@EnableTransactionManagement
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
//        System.out.println("容器对象创建之前");
        //该方法返回值就是容器对象
        SpringApplication.run(DemoApplication.class, args);
//        System.out.println("容器对象创建之后");
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("容器中的对象创建好，执行的方法");
    }
}
