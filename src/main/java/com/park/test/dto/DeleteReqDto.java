package com.park.test.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class DeleteReqDto {
	@NotBlank(message = "값을 입력해주세요")
	@Size(min = 1, max = 3, message = "1~3번까지 값을 입력해주세요")
	private int id;
}
