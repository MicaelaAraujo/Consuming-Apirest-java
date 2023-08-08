package com.ideas.springboot.web.app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ideas.springboot.web.app.service.dto.team.TeamResponse;

@Slf4j
@Service
public class TeamServiceImpl extends AbstractClient implements TeamService {

    public TeamServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }
    @Override
    public TeamResponse findAll() {
        String uri = baseUrl;
        HttpEntity<Void> requestEntity = new HttpEntity<>(null);
        ResponseEntity<TeamResponse> response = restTemplate.exchange(
                uri, HttpMethod.GET, requestEntity , TeamResponse.class);

        if (response.getStatusCode().is2xxSuccessful()) {
        //    log.info("Successfully user creation: {}", response.getBody().getStatus());
            return response.getBody();
        }
        //log.error("Error in user creation - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }


}