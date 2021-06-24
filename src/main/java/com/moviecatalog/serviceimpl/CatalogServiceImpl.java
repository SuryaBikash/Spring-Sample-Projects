package com.moviecatalog.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviecatalog.dao.MovieDetailsRepository;
import com.moviecatalog.exception.MovieException;
import com.moviecatalog.model.MovieDTO;
import com.moviecatalog.model.MovieDetail;
import com.moviecatalog.service.CatalogService;


@Service
public class CatalogServiceImpl extends CatalogService {

	@Autowired
	private MovieDetailsRepository movieRepo;
	
	@Override
	public void createMovie(MovieDTO movie) {
		
		MovieDetail movieDetail=new MovieDetail();
		
		movieDetail.setName(movie.getName());
		movieDetail.setDirector(movie.getDirector());
		movieDetail.setIsActive(true);
		
		movieRepo.save(movieDetail);
	}

	@Override
	public MovieDTO getMovie(Integer movieId) throws MovieException {
		
		 MovieDetail movieDetail=movieRepo.findById(movieId).orElseThrow(()-> new MovieException("Movie notfound"));
		
		 MovieDTO movieDTO=new MovieDTO();
		 
		 movieDTO.setName(movieDetail.getName());
		 movieDTO.setDirector(movieDetail.getDirector());
		 movieDTO.setIsActive(movieDetail.getIsActive());
		 
		 return movieDTO;
	}

	@Override
	public void deleteMovie(Integer movieId) throws MovieException {

		MovieDetail movieDetail=movieRepo.findById(movieId).orElseThrow(()->new MovieException("Movie Not Found"));
		
		if (movieDetail.equals(null)) {
			throw new MovieException("Movie Object Not found");
		}else {
			//soft delete by deactiving the movie
			movieDetail.setIsActive(false);
			movieRepo.save(movieDetail);
		}
	}

	@Override
	public void updateMovie(MovieDTO movie) throws MovieException {

		MovieDetail movieDetail=movieRepo.findById(movie.getMovieId()).orElseThrow(()->new MovieException("Movie not found")); 
		
		movieDetail.setDirector(movie.getDirector());
		movieDetail.setName(movie.getName());
		
		movieRepo.save(movieDetail);
	
	}

}
