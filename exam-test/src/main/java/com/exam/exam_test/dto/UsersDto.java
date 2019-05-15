package com.exam.exam_test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsersDto {

	@JsonProperty(value = "id")
	private int id;
	@JsonProperty(value = "eventusername")
	private String eventUserName;
	@JsonProperty(value = "eventusermac")
	private String eventUserMac;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventUserName() {
		return eventUserName;
	}

	public void setEventUserName(String eventUserName) {
		this.eventUserName = eventUserName;
	}

	public String getEventUserMac() {
		return eventUserMac;
	}

	public void setEventUserMac(String eventUserMac) {
		this.eventUserMac = eventUserMac;
	}

}
