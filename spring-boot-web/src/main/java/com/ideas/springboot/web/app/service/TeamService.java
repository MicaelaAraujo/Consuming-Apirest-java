package com.ideas.springboot.web.app.service;

import com.ideas.springboot.web.app.*;
import com.ideas.springboot.web.app.service.dto.team.TeamResponse;

public interface TeamService {
  TeamResponse buscarClima(String region);
}