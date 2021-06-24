package com.moviecatalog.model;

public class MovieDTO {

	private String name;
	private String director;
	private Integer rating;
	private Boolean isActive;
	private Integer movieId;
			
	public MovieDTO(String name, String director, Integer rating, Boolean isActive, Integer movieId) {
		super();
		this.name = name;
		this.director = director;
		this.rating = rating;
		this.isActive = isActive;
		this.movieId = movieId;
	}

	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	

	
	



}
