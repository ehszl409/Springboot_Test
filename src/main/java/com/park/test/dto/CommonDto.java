package com.park.test.dto;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class CommonDto<T> {
	private int statusCode;
	private T data;
	
	public CommonDto(int status, T data) {
		statusCode = status;
		this.data = data;
	}
}
