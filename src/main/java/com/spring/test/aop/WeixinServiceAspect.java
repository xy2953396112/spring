package com.spring.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 在 Spring 中使用 Aspect 需要使用 @Component 直接将其标记为一个 Bean
 * 并且使用 @Aspec 注解将其标记为一个切面
 * 然后在该类中定义上面我们说的切点，通知等
 */
@Aspect
@Component
public class WeixinServiceAspect {

    @Pointcut("execution(public void WeixinService.share(String))")
    public void shareCut() {

    }

    @AfterReturning("execution(public void WeixinService.share(String))")
    public void log(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature() + " executed");
    }
}