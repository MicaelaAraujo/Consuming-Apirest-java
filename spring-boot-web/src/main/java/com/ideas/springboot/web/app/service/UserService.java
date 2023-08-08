package com.ideas.springboot.web.app.service;

import com.ideas.springboot.web.app.service.dto.user.LoginRequest;
import com.ideas.springboot.web.app.service.dto.user.LoginResponse;
import com.ideas.springboot.web.app.service.dto.user.register.RegisterUserRequest;
import com.ideas.springboot.web.app.service.dto.user.register.RegisteredUserResponse;

public interface UserService {
    RegisteredUserResponse create(RegisterUserRequest user);
    LoginResponse login(LoginRequest loginRequest);
}