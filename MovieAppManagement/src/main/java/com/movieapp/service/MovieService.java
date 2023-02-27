package com.movieapp.service;

import java.util.List;

import com.movieapp.exception.MovieNotExistException;
import com.movieapp.model.Movie;

public interface MovieService {

	Movie addMovies(Movie movie );
	Movie   getMovieById(Integer id)throws MovieNotExistException;
    List<Movie> getAllMovie ();
    Movie   updateMovies(Movie movie);
    Boolean    deleteMovieById(Integer id)throws MovieNotExistException ;
	Movie getMoviesByName(String title);
	

}
