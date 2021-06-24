package com.moviecatalog.service;

import com.moviecatalog.exception.MovieException;
import com.moviecatalog.model.MovieDTO;

public abstract class CatalogService {

	public abstract void createMovie(MovieDTO movie);

	public abstract MovieDTO getMovie(Integer movieId) throws MovieException;

	public abstract void deleteMovie(Integer movieId) throws MovieException;

	public abstract void updateMovie(MovieDTO movie) throws MovieException;

}
