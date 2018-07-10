package com.oubl23.demo.service;

import com.oubl23.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oubl23.demo.mapper.UserMapper;

@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(Long id) {
        return userMapper.getUser(id);
    }
}
