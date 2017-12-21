package com.itmuch.learn.user.controllers;

import com.itmuch.learn.user.domain.User;
import com.itmuch.learn.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Integer id) {
        return this.userRepository.findOne(id);
    }


    // id = 1，或者username = 张三 或者age = 18
    @GetMapping("/users")
    public List<User> findByCondition(
            @RequestParam Integer id,
            @RequestParam String username,
            @RequestParam short age
    ) {
        return this.userRepository.findByIdOrUsernameLikeOrAge(id, username, age);
    }
}
