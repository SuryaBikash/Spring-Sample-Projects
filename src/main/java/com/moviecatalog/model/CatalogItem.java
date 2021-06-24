package com.moviecatalog.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catalog_item")
public class CatalogItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5930038726773728198L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "movieId")
	private Integer movieId;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "rating")
	private Integer rating;
	
	
	
	  public CatalogItem() {
	  
	  }
	  
	  
	  
	  
	  public CatalogItem(Integer movieId, String name, String description, Integer
	  rating) { super(); this.movieId = movieId; this.name = name; this.description
	  = description; this.rating = rating; }
	  
	  
	  
	  
	  public Integer getMovieId() { return movieId; }
	  
	  
	  public void setMovieId(Integer movieId) { this.movieId = movieId; }
	  
	  
	  public String getName() { return name; }
	  
	  
	  public void setName(String name) { this.name = name; }
	  
	  
	  public String getDescription() { return description; }
	  
	  
	  public void setDescription(String description) { this.description =
	  description; }
	  
	  
	  public Integer getRating() { return rating; }
	  
	  
	  public void setRating(Integer rating) { this.rating = rating; }
	  
	  
	 
		
}
