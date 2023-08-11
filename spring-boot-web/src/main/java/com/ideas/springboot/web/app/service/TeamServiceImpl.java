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
    public TeamResponse buscarClima(String region) {
        String uri = baseUrl;
        uri = uri + region + "&aqi=no";
        HttpEntity<Void> requestEntity = new HttpEntity<>(null);
        ResponseEntity<TeamResponse> respuesta = restTemplate.exchange(
                uri, HttpMethod.GET, requestEntity , TeamResponse.class);

        if (respuesta.getStatusCode().is2xxSuccessful()) {
            return respuesta.getBody();
        }
       
        throw new RuntimeException("Error");
    }


}