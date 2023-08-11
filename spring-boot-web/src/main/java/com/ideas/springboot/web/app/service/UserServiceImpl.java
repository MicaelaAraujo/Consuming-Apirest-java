package com.ideas.springboot.web.app.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ideas.springboot.web.app.service.dto.user.LoginRequest;
import com.ideas.springboot.web.app.service.dto.user.LoginResponse;
import com.ideas.springboot.web.app.service.dto.user.register.RegisterUserRequest;
import com.ideas.springboot.web.app.service.dto.user.register.RegisteredUserResponse;

@Slf4j
@Service
public class UserServiceImpl extends AbstractClient implements UserService {

    public UserServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }
    @Override
    public RegisteredUserResponse create(RegisterUserRequest user) {
        String uri = baseUrl + "/user";
        ResponseEntity<RegisteredUserResponse> response = restTemplate.postForEntity(uri, user, RegisteredUserResponse.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        throw new RuntimeException("Error");
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {

        String uri = baseUrl + "/user/login";
        ResponseEntity<LoginResponse> response = restTemplate.postForEntity(uri, loginRequest, LoginResponse.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        throw new RuntimeException("Error");

    }

}