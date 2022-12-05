package com.example.demo_movie.vo;

import com.example.demo_movie.entity.Movie;

public class MovieRes {

	private Movie movie;

	private String message;
	
	public MovieRes() {

	}

	public MovieRes(String message) {
		this.message = message;
	}

	
	public MovieRes(Movie movie, String message) {
		this.movie = movie;
		this.message = message;
	}
	

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
