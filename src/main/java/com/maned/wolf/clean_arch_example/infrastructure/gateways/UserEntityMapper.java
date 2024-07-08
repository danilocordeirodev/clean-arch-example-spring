package com.maned.wolf.clean_arch_example.infrastructure.gateways;

import com.maned.wolf.clean_arch_example.domain.entity.User;
import com.maned.wolf.clean_arch_example.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
  UserEntity toEntity(User userDomain) {
    return new UserEntity(userDomain.username(), userDomain.password(), userDomain.email());
  }

  User toDomain(UserEntity userEntity) {
    return new User(userEntity.getUsername(), userEntity.getHashedPassword(), userEntity.getEmail());
  }
}
