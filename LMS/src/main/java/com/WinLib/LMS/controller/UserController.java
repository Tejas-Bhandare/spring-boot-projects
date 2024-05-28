package com.WinLib.LMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.WinLib.LMS.entity.User;
import com.WinLib.LMS.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping()
    public User addUser(@RequestBody User user) {
        return userService.save(user);
    }
}
