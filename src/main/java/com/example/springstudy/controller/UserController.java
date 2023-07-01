package com.example.springstudy.controller;

import com.example.springstudy.model.entity.User;
import com.example.springstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author: lichengcan
 * @date: 2023-06-27 17:05
 * @description
 **/
@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }


}
