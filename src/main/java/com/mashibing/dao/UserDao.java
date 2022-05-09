package com.mashibing.dao;

import com.mashibing.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public void save(User user){
        System.out.println("save");
    }
    public void update(Integer id){
        System.out.println("update");
    }
    public void delete(Integer id){
        System.out.println("delete");
    }
    public void query(){
        System.out.println("query");
    }
}
