package com.maned.wolf.clean_arch_example.infrastructure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maned.wolf.clean_arch_example.application.usecases.CreateUserInteractor;

@RestController
@RequestMapping("users")
public class UserController {
  private final CreateUserInteractor createUserInteractor;
  private final UserDTOMapper userDTOMapper;

  public UserController(CreateUserInteractor createUserInteractor, UserDTOMapper userDTOMapper) {
    this.createUserInteractor = createUserInteractor;
    this.userDTOMapper = userDTOMapper;
  }

  @PostMapping
  CreateUserResponse creatUser(@RequestBody CreateUserRequest userReq) {
    return userDTOMapper.tResponse(
        createUserInteractor.createUser(userDTOMapper.toUser(userReq)));
  }

}
