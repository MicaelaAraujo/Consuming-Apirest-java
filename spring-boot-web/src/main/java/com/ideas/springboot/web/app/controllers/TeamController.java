package com.ideas.springboot.web.app.controllers;


import com.ideas.springboot.web.app.service.TeamService;
import com.ideas.springboot.web.app.service.dto.team.LocationDTO;
import com.ideas.springboot.web.app.service.dto.team.Team;
import com.ideas.springboot.web.app.service.dto.team.TeamResponse;

import java.util.Map;

import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("worldcup/teams")
    public String verdetalleclima(Map<String, Object> model) {
    	
    TeamResponse respuesta = this.teamService.findAll();
       
       model.put("teamResponse", respuesta);
        
       return "verdetalleclima";
     }
    
    
}