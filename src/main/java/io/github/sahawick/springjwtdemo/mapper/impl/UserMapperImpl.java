package io.github.sahawick.springjwtdemo.mapper.impl;

import io.github.sahawick.springjwtdemo.entity.MyRole;
import io.github.sahawick.springjwtdemo.entity.MyUser;
import io.github.sahawick.springjwtdemo.mapper.MyUserMapper;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class UserMapperImpl implements MyUserMapper {

    @Override
    public User toDto(MyUser model) {
        Set<GrantedAuthority> authorities = model.getAuthorities().stream()
                .map(MyRole::getRole)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toSet());

        User dto = new User(model.getUsername(), model.getPassword(), model.isEnabled(),
                model.isAccountNonExpired(), model.isCredentialsNonExpired(), model.isAccountNonLocked(),
                authorities);

        return dto;
    }
}
