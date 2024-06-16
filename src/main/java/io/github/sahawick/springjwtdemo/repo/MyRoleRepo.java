package io.github.sahawick.springjwtdemo.repo;

import io.github.sahawick.springjwtdemo.entity.MyRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRoleRepo extends JpaRepository<MyRole, Long> {
}
