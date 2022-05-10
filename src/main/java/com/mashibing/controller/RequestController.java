package com.mashibing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestController {

    /**
     * 当发送请求的时候，找到对应处理方法之后，会根据参数的名称从request中获取对应的参数值，并封装到方法中
     * 并此时要求，方法的名字和url中参数的名字必须一致，如果不一致，设置不成功
     *
     * 如果设置不同，同时又想要获取到对应的属性值，可以通过@RequestParam来使用
     * 经常跟@pashVariable混淆，只要注意，两个注解有不同的用处
     *
     * 次注解的参数
     *      value:获取的参数值
     *      required:表示当前属性值是否是必须存在的，默认是true，表示请求中必须要包含此参数，如果没有报错bad request  400
     *      defaultValue:如果传递了参数值，那么使用传递进来的参数，如果没有使用默认值
     * @param name
     * @return
     */
    @RequestMapping("testRequest")
    public String testRequest(@RequestParam(value = "username",required = false,defaultValue = "lisi") String name){
        System.out.println(name);
        return "success";
    }

    /**
     * 获取请求头信息
     * 通过@RequestHeader注解来表示
     * reauest.getHeader("User-Agent")
     * 同时也包含了几个参数
     * value
     * required
     * defultValue
     * 同#RequestParam
     * @param userAgent
     * @return
     */
    @RequestMapping("testRequestHeader")
    public String testRequestHeader(@RequestHeader("User-Agent") String userAgent){
        System.out.println(userAgent);
        return "success";
    }

    /**
     * 获取cookie中的值，使用@CookieValue注解
     * request.getCookies(),返回cookies数组
     *
     * @param jsessionid
     * @return
     */
    @RequestMapping("testCookie")
    public String testCookie(@CookieValue("JSESSIONID") String jsessionid){
        System.out.println(jsessionid);
        return "success";
    }
}
