package com.ideas.springboot.web.app.controllers;


import com.ideas.springboot.web.app.service.TeamService;
import com.ideas.springboot.web.app.service.dto.team.TeamResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("worldcup/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public TeamResponse findAll() {
    	
      return this.teamService.findAll();
    }
}