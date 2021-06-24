package com.moviecatalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviecatalog.model.MovieDetail;

public interface MovieDetailsRepository extends JpaRepository<MovieDetail, Integer>{

}
