package com.spring.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculateExecuteTimeAspect {

    /**
     * 这里的 ProceedingJoinPoint 代表连接的的方法
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("@annotation(com.spring.test.aop.CalculateExecuteTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}