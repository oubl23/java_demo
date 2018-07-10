package com.oubl23.demo.db.service;

import com.oubl23.demo.db.Mapper.UserMapper;
import com.oubl23.demo.db.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userDao;

    public User getUser(Long id) {
        return userDao.getUser(id);
    }
}
