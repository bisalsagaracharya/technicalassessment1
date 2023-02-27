package com.movieapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.movieapp.exception.GenresNotExistException;
import com.movieapp.model.Genres;
import com.movieapp.service.GenresService;
 

@RestController
@RequestMapping("/")
public class GenresController {
	
	 @Autowired
	 private GenresService genresService;
	 
	 @PostMapping("genres")
	 public String addGenres(@RequestBody Genres genres) {
		 this.genresService.addGenres(genres);
		 return("Genres successfully save");
	 }
	 
	 @GetMapping("genres/{id}")
	 public Genres getGenresById(@PathVariable("id") Integer id) throws GenresNotExistException {
		 Genres genresById = this.genresService.getGenresById(id);
		  return genresById;
	 }
	 
	 @GetMapping("allGenres")
		public List<Genres> getAllGenres(){
			List<Genres> allGenres= this.genresService.getAllGenres();
			return allGenres;
		}
	 
	 @PutMapping("updateGenres")
		public Genres updateGenres(@RequestBody Genres genres) {
		 Genres updatedGenres = this.genresService.updateGenres(genres);
			return updatedGenres;
		}
	 
	 @DeleteMapping("genres/{id}")
		public String deleteGenres(@PathVariable("id") Integer id) throws GenresNotExistException {
			this.genresService.deleteGenresById(id);
			return"Sucessfully delete Genres With ID"+id;		
		}
	 @GetMapping("genrename/{name}")
	 Optional<Genres> getrGenreByName(@PathVariable String name) throws GenresNotExistException {
	     Optional<Genres> genre1 = this.genresService.getGeneresByName(name);
	     return genre1;
	 }

}
