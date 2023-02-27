package com.app.service;

import com.app.dto.Movies;
import com.app.exception.MovieException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements  MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movies addNewMovie(Movies movies) {
        return this.movieRepository.save(movies);
    }

    @Override
    public Movies getMoviesByName(String title) {

        return this.movieRepository.findByTitle(title);
    }

    @Override
    public Optional<Movies> getMoviesById(Integer id) throws MovieException {
        Optional<Movies> findById = this.movieRepository.findById(id);
        if (findById.isEmpty()) {
            throw new MovieException("Movie not available for this Id" + findById);
        } else {
            return findById;
        }
    }

    @Override
    public List<Movies> getAllMovies() {
        return this.movieRepository.findAll();
    }

    @Override
    public void deleteMovieById(Integer id) throws MovieException {
        Optional<Movies> findById = this.movieRepository.findById(id);
        if (findById.isEmpty()) {
            throw new MovieException("Movie not available for this Id" + findById);
        } else {
            this.movieRepository.deleteById(id);
        }
    }

    @Override
    public List<Movies> findByMoviesId(Integer movies_Id) {
        List<Movies> list = movieRepository.findByMoviesId(movies_Id);
        list.forEach(l -> System.out.println(l));
        return list;
    }


}