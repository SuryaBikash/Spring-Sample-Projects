package com.moviecatalog.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "movie_details")
public class MovieDetail implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 526370338411794282L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer movieId;
	@Column(name = "name")
	private String name;
	@Column(name = "director")
	private String director;
	
	private Boolean isActive;
	
	
	public MovieDetail() {
	}
	
	public MovieDetail(Integer movieId, String name, String director, Boolean isActive) {
		this.movieId = movieId;
		this.name = name;
		this.director = director;
		this.isActive = isActive;
	}

	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	

}
