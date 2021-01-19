package com.park.test.domain;

import java.sql.Timestamp;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {
	private int id;
	private String title;
	private Double rating;
	private Timestamp makeDate = new Timestamp(System.currentTimeMillis());
	
	
}
