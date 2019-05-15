package com.exam.exam_test.dto;

public class RootDto {

	private String callstatus;
	private String message;

	public String getCallstatus() {
		return callstatus;
	}

	public void setCallstatus(String callstatus) {
		this.callstatus = callstatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RootDto() {
		// TODO Auto-generated constructor stub
	}

	public RootDto(String callstatus, String message) {
		super();
		this.callstatus = callstatus;
		this.message = message;
	}

	@Override
	public String toString() {
		return "RootDto [callstatus=" + callstatus + ", message=" + message + "]";
	}

	
}
