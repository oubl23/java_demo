package com.oubl23.demo;

import com.oubl23.demo.db.pojo.User;
import com.oubl23.demo.db.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-mybatis.xml")
public class UserTest{
    @Autowired
    private UserService userService;

    @Test
    public void getStaffTest(){
        User u = userService.getUser(1L);
        System.out.println(u.getUserName());
    }
}