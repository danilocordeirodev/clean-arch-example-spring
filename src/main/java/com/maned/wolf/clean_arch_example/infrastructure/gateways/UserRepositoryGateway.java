package com.maned.wolf.clean_arch_example.infrastructure.gateways;

import com.maned.wolf.clean_arch_example.application.gateways.UserGateway;
import com.maned.wolf.clean_arch_example.domain.entity.User;
import com.maned.wolf.clean_arch_example.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
  private final UserRepository userRepository;
  private final UserEntityMapper userEntityMapper;

  public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    this.userRepository = userRepository;
    this.userEntityMapper = userEntityMapper;
  }

  @Override
  public User creatUser(User user) {
    return userEntityMapper.toDomain(
        userRepository.save(userEntityMapper.toEntity(user)));
  }

}
