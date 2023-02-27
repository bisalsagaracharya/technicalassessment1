package com.movieapp.service;

import java.util.List;

import com.movieapp.exception.ActorsNotExistException;
import com.movieapp.model.Actors;
 

public interface ActorsService {
	
	Actors addActors(Actors actors );
	Actors   getActorsById(Integer id)throws ActorsNotExistException;
    List<Actors> getAllActors();
    Actors   updateActors(Actors actors);
    Boolean    deleteActorsById(Integer id)throws ActorsNotExistException ;
	List<Actors> getActorsByBornYear(Integer yearOfBirth);
	List<Actors> getActorsLastNameLike(String lastName);
    
}
