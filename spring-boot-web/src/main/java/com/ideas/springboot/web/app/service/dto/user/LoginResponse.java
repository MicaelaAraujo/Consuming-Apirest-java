package com.ideas.springboot.web.app.service.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ideas.springboot.web.app.service.dto.user.register.RegisteredDataUser;
import lombok.Data;

@Data
public class LoginResponse {

    private String status;
    @JsonProperty("data")
    private RegisteredDataUser registeredDataUser;
}