package com.zhangcg.demo.controller;

import com.zhangcg.demo.entity.User;
import com.zhangcg.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


/**
 * Created by zhangcg.
 */
@RestController
public class IndexController {
    @Autowired
    private UserService userService;
    @GetMapping("/show")
    public List<User> getUser(int age){
        return userService.getUser(age);
    }

    @GetMapping("/show112")
    public String getUser(){
        return "nono";
    }

}
