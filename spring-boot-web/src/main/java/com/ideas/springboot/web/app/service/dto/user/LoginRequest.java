package com.ideas.springboot.web.app.service.dto.user;

import lombok.Data;

@Data
public class LoginRequest {

    private String email;
    private String password;
}