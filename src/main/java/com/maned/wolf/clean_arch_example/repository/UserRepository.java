package com.maned.wolf.clean_arch_example.repository;

import org.springframework.data.repository.CrudRepository;

import com.maned.wolf.clean_arch_example.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
