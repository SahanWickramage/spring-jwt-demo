package io.github.sahawick.springjwtdemo.repo;

import io.github.sahawick.springjwtdemo.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRepo extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByUsername(String user);
}
