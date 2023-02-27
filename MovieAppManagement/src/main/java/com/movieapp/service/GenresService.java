package com.movieapp.service;

import java.util.List;
import java.util.Optional;

import com.movieapp.exception.GenresNotExistException;
import com.movieapp.exception.MovieNotExistException;
import com.movieapp.model.Genres;
import com.movieapp.model.Movie;

public interface GenresService {
	
	Genres addGenres(Genres genres );
	Genres   getGenresById(Integer id)throws GenresNotExistException;
    List<Genres> getAllGenres ();
    Genres   updateGenres(Genres genres);
    Boolean    deleteGenresById(Integer id)throws GenresNotExistException ;
	Optional<Genres> getGeneresByName(String name);

}
