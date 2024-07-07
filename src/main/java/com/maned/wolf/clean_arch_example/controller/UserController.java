package com.maned.wolf.clean_arch_example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maned.wolf.clean_arch_example.model.User;
import com.maned.wolf.clean_arch_example.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  User creatUser(@RequestBody User user) {
    return userService.create(user);
  }

}
