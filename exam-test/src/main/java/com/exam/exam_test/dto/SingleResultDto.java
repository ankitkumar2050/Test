package com.exam.exam_test.dto;

public class SingleResultDto extends RootDto {

	private Object result;

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public SingleResultDto() {
	}

	public SingleResultDto(String callStatus, String message) {
		super(callStatus, message);
	}

	public SingleResultDto(String callStatus, String message, Object result) {
		super(callStatus, message);
		this.result = result;
	}
}
