package io.github.sahawick.springjwtdemo.service.impl;

import io.github.sahawick.springjwtdemo.entity.MyUser;
import io.github.sahawick.springjwtdemo.repo.MyUserRepo;
import io.github.sahawick.springjwtdemo.service.MyUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MyUserServiceImpl implements MyUserService {

    private final MyUserRepo myUserRepo;

    @Override
    public Optional<MyUser> getMyUserByUsername(String username) {
        return myUserRepo.findByUsername(username);
    }
}
