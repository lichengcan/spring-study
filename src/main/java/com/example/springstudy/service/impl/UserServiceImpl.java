package com.example.springstudy.service.impl;

import com.example.springstudy.mapper.UserMapper;
import com.example.springstudy.model.entity.User;
import com.example.springstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lichengcan
 * @date: 2023-07-01 21:40
 * @description
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getUser(Long id) {
        return userMapper.selectById(id);
    }
}
