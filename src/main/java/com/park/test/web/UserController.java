package com.park.test.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.park.test.domain.Movie;
import com.park.test.domain.MovieRepository;
import com.park.test.dto.CommonDto;
import com.park.test.dto.DeleteReqDto;
import com.park.test.dto.SaveReqDto;
import com.park.test.dto.UpdateReqDto;

@RestController
public class UserController {

	MovieRepository movieRepository;

	public UserController() {
		movieRepository = new MovieRepository();
	}

	@GetMapping("/movie")
	public List<Movie> findAll() {
		System.out.println("find()");
		return movieRepository.findAll();
	}

	@GetMapping("/movie/{id}")
	public Movie findById(@PathVariable int id) {
		System.out.println("findById()" + id);
		return movieRepository.findById(id);
	}

	@PostMapping("/movie")
	public CommonDto<?> save(@Valid @RequestBody SaveReqDto dto, BindingResult bindingResult) {
		System.out.println("save()");
		return new CommonDto<>(HttpStatus.ACCEPTED.value(), "OK");
	}

	@DeleteMapping("/movie/{id}")
	public CommonDto<?> delete(@PathVariable int id) {
		System.out.println("delete()" + id);
		int result = movieRepository.delete(id);
		if (result == 1)
			return new CommonDto<>(HttpStatus.ACCEPTED.value(), "OK");
		else
			return new CommonDto<>(HttpStatus.BAD_GATEWAY.value(), "fail");
	}

	@PutMapping("/movie/{id}")
	public CommonDto<?> update(@PathVariable int id, @Valid @RequestBody UpdateReqDto dto,
			BindingResult bindingResult) {
		System.out.println("update()" + id);
		return new CommonDto<>(HttpStatus.ACCEPTED.value(), "OK");
	}
}
