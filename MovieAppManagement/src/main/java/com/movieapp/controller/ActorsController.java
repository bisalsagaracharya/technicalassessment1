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
import com.movieapp.exception.ActorsNotExistException;
import com.movieapp.model.Actors;
import com.movieapp.service.ActorsService;
 

@RestController
@RequestMapping("/")
public class ActorsController {
	
	 @Autowired
	 private ActorsService actorsService;
	 
	 @PostMapping("Actors")
	 public String addActors(@RequestBody Actors actors) {
		 this.actorsService.addActors(actors);
		 return("Actors successfully save");
	 }
	 
	 @GetMapping("actors/{id}")
	 public Actors getActorsById(@PathVariable("id") Integer id) throws ActorsNotExistException {
		    Actors actorsById = this.actorsService.getActorsById(id);
		  return actorsById;
	 }
	 
	 @GetMapping("allActors")
		public List<Actors> getAllActors(){
			List<Actors> allActors= this.actorsService.getAllActors();
			return allActors;
		}
	 
	 @PutMapping("updateActors")
		public Actors updateActors(@RequestBody Actors actors) {
		 Actors updatedActors = this.actorsService.updateActors(actors);
			return updatedActors;
		}
	 
	 @DeleteMapping("actors/{id}")
		public String deleteMovie(@PathVariable("id") Integer id) throws ActorsNotExistException {
			this.actorsService.deleteActorsById(id);
			return"Sucessfully delete Actors With ID"+id;		
		}
	 
	 @GetMapping("actorbirth/{yearOfBirth}")
	 List<Actors> getActorsBornAfterYear(@PathVariable ("yearOfBirth") Integer yearOfBirth){
	     List<Actors> list = this.actorsService.getActorsByBornYear(yearOfBirth);
	     return list;
	 }

	 @GetMapping("actors/nameslike/{lastName}")
	 List<Actors> getActorsNamesLikes(@PathVariable ("lastName")String lastName){
	     List<Actors> list = this.actorsService.getActorsLastNameLike(lastName);
	     return list;
	 }

}
