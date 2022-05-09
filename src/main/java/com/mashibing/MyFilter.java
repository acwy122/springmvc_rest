package com.mashibing;


import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器开始执行");
        filterChain.doFilter(servletRequest,servletResponse);

    }
}