package com.app.service;


import com.app.dto.Movies;
import com.app.exception.MovieException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface MovieService {
    Movies addNewMovie(Movies movies);
    Movies getMoviesByName(String title);
    Optional<Movies> getMoviesById(Integer id) throws MovieException;
    List<Movies> getAllMovies();
    void deleteMovieById(Integer id) throws MovieException;
    List<Movies> findByMoviesId(Integer movies_Id);
}
