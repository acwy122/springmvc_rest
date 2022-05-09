package com.mashibing;


import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器开始执行");

        System.out.println(this.getClass().getName()+"-------start");
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println(this.getClass().getName()+"-------stop");
    }
}
