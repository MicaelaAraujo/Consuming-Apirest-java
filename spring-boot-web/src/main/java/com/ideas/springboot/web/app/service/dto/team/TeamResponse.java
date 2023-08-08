package com.ideas.springboot.web.app.service.dto.team;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TeamResponse {
    
	 private LocationDTO location;
	 private CurrentDTO current;

	    // Agregar getters y setters para los campos

	    public LocationDTO getLocation() {
	        return location;
	    }

	    public void setLocation(LocationDTO location) {
	        this.location = location;
	    }

	    public CurrentDTO getCurrent() {
	        return current;
	    }

	    public void setCurrent(CurrentDTO current) {
	        this.current = current;
	    }
}