package io.github.sahawick.springjwtdemo.mapper;

import io.github.sahawick.springjwtdemo.entity.MyUser;
import org.springframework.security.core.userdetails.User;

public interface MyUserMapper {
    User toDto(MyUser model);
}
