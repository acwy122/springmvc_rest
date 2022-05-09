package com.mashibing.controller;

import com.mashibing.bean.User;
import com.mashibing.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * localhost:8080/save
 * localhost:8080/update?id=1
 * localhost:8080/delete?id=1
 * localhost:8080/query
 * 我们在发送请求的时候，有不同的请求方式，能不能通过请求方式做一次转换
 * post：新增   /user
 * get：获取    /user
 * put：更新    /user/1
 * delete：删除 /user/1
 *
 */
@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user" ,method = RequestMethod.POST)
    public String save(){
        System.out.println(this.getClass().getName());
        userDao.save(new User());
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String update(Integer id){
        System.out.println(this.getClass().getName());
        userDao.update(id);
        return "success";
    }
    @RequestMapping(value = "/user" ,method = RequestMethod.DELETE)
    public String delete(Integer id){
        System.out.println(this.getClass().getName());
        userDao.delete(id);
        return "success";
    }
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String query(){
        System.out.println(this.getClass().getName());
        userDao.query();
        return "success";
    }
}
