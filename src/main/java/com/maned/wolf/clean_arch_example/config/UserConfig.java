package com.maned.wolf.clean_arch_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.maned.wolf.clean_arch_example.application.gateways.UserGateway;
import com.maned.wolf.clean_arch_example.application.usecases.CreateUserInteractor;
import com.maned.wolf.clean_arch_example.infrastructure.controller.UserDTOMapper;
import com.maned.wolf.clean_arch_example.infrastructure.gateways.UserEntityMapper;
import com.maned.wolf.clean_arch_example.infrastructure.gateways.UserRepositoryGateway;
import com.maned.wolf.clean_arch_example.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {
  @Bean
  CreateUserInteractor createUserCase(UserGateway userGateway) {
    return new CreateUserInteractor(userGateway);
  }

  @Bean
  UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    return new UserRepositoryGateway(userRepository, userEntityMapper);
  }

  @Bean
  UserEntityMapper userEntityMapper() {
    return new UserEntityMapper();
  }

  @Bean
  UserDTOMapper userDTOMapper() {
    return new UserDTOMapper();
  }

}
