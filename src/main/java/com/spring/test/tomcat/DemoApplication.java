package com.spring.test.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBootServletInitializer类文件允许在使用Servlet容器启动时配置应用程序。
 * 在Spring Boot中，需要在构建文件中指定启动的主类。
 * <start-class>com.spring.test.tomcat.DemoApplication</start-class>
 */
@SpringBootApplication
@RestController
public class DemoApplication  extends SpringBootServletInitializer {
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(DemoApplication.class);
   }
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }

   @RequestMapping(value = "/")
   public String hello() {
      return "Hello World from Tomcat";
   }
}





