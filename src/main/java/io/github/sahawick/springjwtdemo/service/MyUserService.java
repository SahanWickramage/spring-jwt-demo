package io.github.sahawick.springjwtdemo.service;

import io.github.sahawick.springjwtdemo.entity.MyUser;

import java.util.Optional;

public interface MyUserService {

    Optional<MyUser> getMyUserByUsername(String username);
}
