package com.oubl23.demo.controller;

import com.oubl23.demo.pojo.User;
import com.oubl23.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("userController")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/user/{id}")
    public User user(@PathVariable Long id) {
        return userService.getUser(id);
    }

}
