package io.github.sahawick.springjwtdemo.service.impl;

import io.github.sahawick.springjwtdemo.entity.MyUser;
import io.github.sahawick.springjwtdemo.service.MyUserService;
import io.github.sahawick.springjwtdemo.mapper.MyUserMapper;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

@AllArgsConstructor
public class MyUserDetailService implements UserDetailsService {

    private final MyUserService myUserService;

    private final MyUserMapper myUserMapper;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> myUserOptional = myUserService.getMyUserByUsername(username);
        if (myUserOptional.isEmpty()) {
            throw new UsernameNotFoundException("user: " + username + " is not found!");
        }

        MyUser myUser = myUserOptional.get();
        User user = myUserMapper.toDto(myUser);
        return user;
    }
}
