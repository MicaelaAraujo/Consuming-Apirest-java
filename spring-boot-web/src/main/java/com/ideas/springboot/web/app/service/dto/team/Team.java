package com.ideas.springboot.web.app.service.dto.team;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Team {

	@JsonProperty("location")
	private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String tz_id;
    private long localtime_epoch;
    private String localtime;

}