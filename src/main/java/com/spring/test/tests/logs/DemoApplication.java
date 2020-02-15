package com.spring.test.tests.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot使用Apache Commons日志记录进行所有内部日志记录。
 * Spring Boot的默认配置支持使用Java Util Logging，Log4j2和Logback。
 * 使用这些，可以配置控制台日志记录以及文件日志记录。
 *
 * 如果使用的是Spring Boot Starters，Logback将为日志记录提供良好的支持。
 * 此外，Logback还提供对Common Logging，Util Logging，Log4J和SLF4J的良好支持。
 */
@SpringBootApplication
public class DemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        logger.info("this is a info message");
        logger.warn("this is a warn message");
        logger.error("this is a error message");
        SpringApplication.run(DemoApplication.class, args);
    }
}
