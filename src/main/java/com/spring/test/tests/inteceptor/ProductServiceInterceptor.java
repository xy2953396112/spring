package com.spring.test.tests.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器上工作时应该了解的三种方法 : preHandle()方法 - 用于在将请求发送到控制器之前执行操作。此方法应返回true，以将响应返回给客户端。 postHandle()方法 -
 * 用于在将响应发送到客户端之前执行操作。 afterCompletion()方法 - 用于在完成请求和响应后执行操作。
 */
@Component
public class ProductServiceInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle
            (HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("Pre Handle method is Calling");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("Post Handle method is Calling");
    }

    @Override
    public void afterCompletion
            (HttpServletRequest request, HttpServletResponse response, Object
                    handler, Exception exception) throws Exception {

        System.out.println("Request and Response is completed");
    }
}


