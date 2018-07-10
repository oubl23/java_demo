package com.oubl23.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller("UserController")
public class UserController {
    @ResponseBody
    @RequestMapping(value = "/admin/user",method = RequestMethod.GET)
    public Map userlist(){
        Map<String,String> res  = new HashMap<>();
        res.put("result","success");
        return res;
    }
}
