package com.moviecatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moviecatalog.exception.MovieException;
import com.moviecatalog.model.MovieDTO;
import com.moviecatalog.service.CatalogService;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private CatalogService catalogService;

	@GetMapping("/viewMovie")
	public ResponseEntity<Object> getMovie(@RequestParam("movieId") Integer movieId) throws MovieException {
		MovieDTO movie=null;
		if (movieId == 0) {
			throw new MovieException("Movie id should not be zero");
		} else {
			movie = catalogService.getMovie(movieId);
		}

		return ResponseEntity.ok(movie);

	}

	@PostMapping("/createMovie")
	public ResponseEntity<Object> registermovie(@RequestBody MovieDTO movie) throws MovieException {
		if (movie.equals(null)) {
			throw new MovieException("Movie should not be Empty");
		} else {
			catalogService.createMovie(movie);
		}

		return ResponseEntity.ok(HttpStatus.CREATED);
	}
	@PutMapping("/updateMovie")
	public ResponseEntity<Object> updateMovie(@RequestBody MovieDTO movie) throws MovieException {
		if (movie.equals(null)) {
			throw new MovieException("Movie should not be Empty");
		} else {
			catalogService.updateMovie(movie);
		}

		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteMovie")
	public ResponseEntity<Object> deleteById(@RequestParam("movieId") Integer movieId) throws MovieException{
		if (movieId == 0) {
			throw new MovieException("Movie Id Should Not be Zero");
		} else {
			catalogService.deleteMovie(movieId);
		}
		return ResponseEntity.ok(HttpStatus.OK);
	}


}
