package com.park.test.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SaveReqDto {
	@NotBlank(message = "값을 입력해주세요")
	@Size(min = 1, max = 10, message = "1~10자로 입력해주세요")
	private String title;
	
	@NotBlank(message = "값을 입력해주세요")
	@Size(min = 1, max = 10, message = "1~10자로 입력해주세요")
	private String rating;
}
