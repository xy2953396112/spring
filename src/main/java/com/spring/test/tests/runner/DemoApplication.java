package com.spring.test.tests.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用程序运行器(Runner)是一个用于在Spring Boot应用程序启动后执行代码的接口。
 */
@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        System.out.println("Hello World from Application Runner");
    }
}

