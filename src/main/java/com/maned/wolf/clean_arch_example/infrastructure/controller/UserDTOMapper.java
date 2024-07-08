package com.maned.wolf.clean_arch_example.infrastructure.controller;

import com.maned.wolf.clean_arch_example.domain.entity.User;

public class UserDTOMapper {
  CreateUserResponse tResponse(User user) {
    return new CreateUserResponse(user.username(), user.email());
  }

  public User toUser(CreateUserRequest request) {
    return new User(request.username(), request.password(), request.email());
  }
}
