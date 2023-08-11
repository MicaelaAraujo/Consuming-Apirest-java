package com.ideas.springboot.web.app.controllers;


import com.ideas.springboot.web.app.service.TeamService;
import com.ideas.springboot.web.app.service.dto.team.LocationDTO;
import com.ideas.springboot.web.app.service.dto.team.Team;
import com.ideas.springboot.web.app.service.dto.team.TeamResponse;

import java.util.Map;

import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class TeamController {

    private final TeamService teamService;
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("verdetalleclima")
    public String verdetalleclima(Map<String, Object> model) {
    	
      //  model.put("teamResponse", respuesta);
        return "verdetalleclima";
      }
    
    @GetMapping("buscarclima")
    public String buscarclima(Map<String, Object> model) {
        return "buscarclima";
      }
    
    @PostMapping("/buscarclima")
    public String buscarclima(@RequestParam String region, Map<String, Object> model) {
    	TeamResponse respuesta = this.teamService.buscarClima(region); 
   //     List<Team> equiposEnRegion = teamService.buscarPorRegion(region);
      //  model.put("equiposEnRegion", equiposEnRegion);
    	model.put("clima", respuesta);
        return "verdetalleclima";
    }
    
    
    
}