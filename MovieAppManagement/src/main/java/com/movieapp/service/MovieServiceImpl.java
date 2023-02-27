package com.movieapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movieapp.exception.MovieNotExistException;
import com.movieapp.model.Movie;
import com.movieapp.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieRepo;

	@Override
	public Movie addMovies(Movie movie) {
	  Movie save = this.movieRepo.save(movie);
	  return save;
	
	}

	@Override
	public Movie getMovieById(Integer id) throws MovieNotExistException {
		Optional<Movie> findById = this.movieRepo.findById(id);
        if (findById.isPresent()) {
            return findById.get();
        } else {
            throw new MovieNotExistException("user is not present in database");
        }
	}

	@Override
	public List<Movie> getAllMovie() {
		 List<Movie> allMovie = this.movieRepo.findAll();
		return allMovie;
	}

	@Override
	public Movie updateMovies(Movie movie) {
		 Movie save = this.movieRepo.save(movie);
		return save;
	}

	@Override
	public Boolean deleteMovieById(Integer id) throws MovieNotExistException {
		 Optional<Movie> findById = movieRepo.findById(id);
	        if (findById.isPresent()) {
	            this.movieRepo.deleteById(id);
	            return true;
	        } else {
	            throw new MovieNotExistException("Movie Not exist");
	        }
		
	}

	@Override
	public Movie getMoviesByName(String Title) {
		return this.movieRepo.findByTitle(Title);
	 
	}

}
