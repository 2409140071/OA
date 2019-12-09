package com.abc.controller;

import com.abc.beans.User;
import com.abc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private IUserService userService;

    @RequestMapping("/register.do")
    public String register(User user){
        System.out.println("controller="+user);
        userService.addUser(user);

        return "/WEB-INF/jsp/welcome.jsp";
    }
}
