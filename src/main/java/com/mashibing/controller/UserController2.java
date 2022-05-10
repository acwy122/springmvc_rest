package com.mashibing.controller;


import com.mashibing.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * 乱码问题解决
 * 我们需要设置过滤   request 和response的编码方式，可以自己手动编写过滤器，也可以由线程的框架来实现
 * post：必须要分别设置对应的request和response的编码方式
 * get：再tomcat的server.xml文件中添加URIEncoding=utf-8
 * 在一个应用程序中可能会包含N多个过滤器，这N多个过滤器一般是没有顺序要求的，但是如果设置了编码过滤器
 * 那么要求必须要把编码过滤器设置到最上面，保证编码过滤器优先执行
 *
 *
 */
@Controller
public class UserController2 {

    @RequestMapping("testUser")
    public String testUser(User user){

        System.out.println(user);
        return "success";
    }

    /**
     * Controller中也支持原生Servlet的对象，需要在参数中给出
     * HttpServletRequest:
     * HttpServletResponse:
     * HttpSession:
     * Locale:设置区域信息,国际化的操作
     * InputStream:
     * outputStream:
     * Reader
     * Writer:
     *
     * @param request
     * @param response
     * @param session
     * @return
     */
    @RequestMapping("servletApi")
    public String servletApi(HttpServletRequest request, HttpServletResponse response, HttpSession session, Locale locale){
//        response.getWriter().write();
        request.setAttribute("request","request");
        session.setAttribute("session","session");
        System.out.println(locale.getCountry());
        return "success";
    }

}
