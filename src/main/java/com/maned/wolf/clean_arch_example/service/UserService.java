package com.maned.wolf.clean_arch_example.service;

import org.springframework.stereotype.Service;

import com.maned.wolf.clean_arch_example.model.User;
import com.maned.wolf.clean_arch_example.repository.UserRepository;

@Service
public class UserService {
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User create(User user) {
    return userRepository.save(user);
  }

}
