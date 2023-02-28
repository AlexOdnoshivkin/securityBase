package com.myproject.securityDemo.services;

import com.myproject.securityDemo.model.user.User;
import com.myproject.securityDemo.model.user.UserDto;

import java.util.List;

public interface UserService {
    User saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
