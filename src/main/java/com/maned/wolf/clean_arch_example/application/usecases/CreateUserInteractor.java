package com.maned.wolf.clean_arch_example.application.usecases;

import com.maned.wolf.clean_arch_example.application.gateways.UserGateway;
import com.maned.wolf.clean_arch_example.domain.entity.User;

public class CreateUserInteractor {
  private UserGateway userGateway;

  public CreateUserInteractor(UserGateway userGateway) {
    this.userGateway = userGateway;
  }

  public User createUser(User user) {
    return userGateway.creatUser(user);
  }
}
