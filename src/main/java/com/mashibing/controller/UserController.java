package com.mashibing.controller;

import com.mashibing.bean.User;
import com.mashibing.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * localhost:8080/save
 * localhost:8080/update?id=1
 * localhost:8080/delete?id=1
 * localhost:8080/query
 * 我们在发送请求的时候，有不同的请求方式，能不能通过请求方式做一次转换
 * post：
 * get：
 * put：
 * delete：
 *
 */
@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/save")
    public String save(){
        System.out.println(this.getClass().getName());
        userDao.save(new User());
        return "save";
    }

    @RequestMapping("/update")
    public String update(Integer id){
        System.out.println(this.getClass().getName());
        userDao.update(id);
        return "update";
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        System.out.println(this.getClass().getName());
        userDao.delete(id);
        return "delete";
    }
    @RequestMapping("/query")
    public String query(){
        System.out.println(this.getClass().getName());
        userDao.query();
        return "query";
    }
}
