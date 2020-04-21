package com.worriedfox.web;

import com.worriedfox.domain.User;
import com.worriedfox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public User getUser(){
        System.out.println("走到这儿了。。。。。。。");
        User user = userService.getUser();
        System.out.println(user.toString());
        return user;
    }

    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }
}
