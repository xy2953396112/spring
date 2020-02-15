package com.spring.test.aop;

import org.springframework.stereotype.Service;

@Service
public class WeixinService {

    @CalculateExecuteTime
    public void share(String articleUrl) {
        System.out.println("Share article:" + articleUrl);
    }
}