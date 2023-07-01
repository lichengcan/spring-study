package com.example.springstudy.service;

import com.example.springstudy.model.entity.User;

public interface UserService {
    void save(User user);

    User getUser(Long id);

}
