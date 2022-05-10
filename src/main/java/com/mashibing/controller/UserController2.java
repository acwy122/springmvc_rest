package com.mashibing.controller;


import com.mashibing.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
