package com.movieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieapp.exception.MovieNotExistException;
import com.movieapp.model.Movie;
import com.movieapp.service.MovieService;

@RestController
@RequestMapping("/")
public class MovieController {
    
	 @Autowired
	 private MovieService movieService;
	 
	 @PostMapping("movie")
	 public String addMovie(@RequestBody Movie movie) {
		 this.movieService.addMovies(movie);
		 return("Movies successfully save");
	 }
	 
	 @GetMapping("movie/{id}")
	 public Movie getMovieById(@PathVariable("id") Integer id) throws MovieNotExistException {
		    Movie movieById = this.movieService.getMovieById(id);
		  return movieById;
	 }
	 
	 @GetMapping("allMovie")
		public List<Movie> getAllMovie(){
			List<Movie> allMovie= this.movieService.getAllMovie();
			return allMovie;
		}
	 
	 @PutMapping("updateMovie")
		public Movie updateMovie(@RequestBody Movie movie) {
		 Movie updatedMovie = this.movieService.updateMovies(movie);
			return updatedMovie;
		}
	 
	 @DeleteMapping("movie/{id}")
		public String deleteMovie(@PathVariable("id") Integer id) throws MovieNotExistException {
			this.movieService.deleteMovieById(id);
			return"Sucessfully delete Movie With ID"+id;		
		}
	 @GetMapping("moviesname/{Title}")
	 Movie getMoviesByName(@PathVariable String Title) {
	     Movie movies = this.movieService.getMoviesByName(Title);
	     return movies;
	 }
	 
}
