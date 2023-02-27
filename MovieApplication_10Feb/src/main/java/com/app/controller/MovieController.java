package com.app.controller;

import com.app.dto.Movies;
import com.app.exception.MovieException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.app.service.MovieService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")

public class MovieController {
    @Autowired
    private MovieService movieService;
//retrieving all records with actors appearing in it (do left join fetch in the query)

    @PostMapping("movie")
    Movies addNewMovie(@RequestBody Movies movies) {
        Movies movies1 = this.movieService.addNewMovie(movies);
        return movies1;
    }

    @GetMapping("moviesid/{id}")
    Optional<Movies> getMoviesById(@PathVariable Integer id) throws MovieException {
        Optional<Movies> movies = this.movieService.getMoviesById(id);
        return movies;
    }

    @GetMapping("moviesname/{title}")
    Movies getMoviesByName(@PathVariable String title) {
        Movies movies = this.movieService.getMoviesByName(title);
        return movies;
    }

    @GetMapping("movies")
    List<Movies> getAllMovies() {
        List<Movies> movies = this.movieService.getAllMovies();
        return movies;
    }

//    @GetMapping("/movies/actors/left")
//    public ResponseEntity<List<Movies>> getDeptEmployeesLeftJoin() {
//        return new ResponseEntity<List<Movies>>(movieService.getDeptEmployeesLeftJoin(), HttpStatus.OK);
//    }

    @DeleteMapping("movies/{id}")
    String deleteMoviesById(@PathVariable Integer id) throws MovieException {
        this.movieService.deleteMovieById(id);
        return "Movie got deleted successfully";
    }
    @GetMapping("movie/actors/{movies_Id}")
    List<Movies> getAllActorsFromMovies(@PathVariable Integer movies_Id){
        return this.movieService.findByMoviesId(movies_Id);
    }

}
