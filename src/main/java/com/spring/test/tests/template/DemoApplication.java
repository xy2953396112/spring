package com.spring.test.tests.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Componentscan注释用于查找bean以及使用@autowired注释注入的相应内容。
 */
@SpringBootApplication
public class DemoApplication {

   @Autowired
   RestTemplate restTemplate;

   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }

   @Bean
   public RestTemplate getRestTemplate() {
      return new RestTemplate();
   }
}

