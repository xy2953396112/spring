package com.spring.test.tests.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.stereotype.Component;

/**
 * 过滤器是用于拦截应用程序的HTTP请求和响应的对象。
 */
@Component
public class SimpleFilter implements Filter {

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
            throws IOException, ServletException {

        System.out.println("Remote Host:" + request.getRemoteHost());
        System.out.println("Remote Address:" + request.getRemoteAddr());
        filterchain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterconfig) throws ServletException {
    }
}
