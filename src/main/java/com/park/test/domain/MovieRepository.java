package com.park.test.domain;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
	Movie movie = new Movie();
	Timestamp date = movie.getMakeDate();
	
	public List<Movie> findAll() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "포레스트검프", 8.90, date));
		movies.add(new Movie(2, "사랑의블랙홀", 8.87, date));
		movies.add(new Movie(3, "매트릭스", 9.12, date));
		return movies;
	}
	
	public Movie findById(int id) {
		if(id == 1)
			return new Movie(1, "포레스트검프", 8.90, date);
		else if(id == 2)
			return new Movie(2, "사랑의블랙홀", 8.87, date);
		else if (id == 3)
			return new Movie(3, "매트릭스", 9.12, date);
		else
			return null;
	}
	
	public void save() {
		System.out.println("save");
	}
	
	public int delete(int id) {
		System.out.println("delete");
		if(id>0 && id<4)
			return 1;
		else 
			return 0;
	}
	
	public void update() {
		System.out.println("update");
	}
}
