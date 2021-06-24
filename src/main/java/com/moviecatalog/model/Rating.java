package com.moviecatalog.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "rating")
public class Rating implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6488263888380009375L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "rating")
	private Integer rating;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "movie_id")
	private MovieDetail movie;
	
	
	public Rating() {
	}


	public Rating(Integer id, Integer rating, MovieDetail movie) {
		this.id = id;
		this.rating = rating;
		this.movie = movie;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public MovieDetail getMovie() {
		return movie;
	}


	public void setMovie(MovieDetail movie) {
		this.movie = movie;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	


	
}
