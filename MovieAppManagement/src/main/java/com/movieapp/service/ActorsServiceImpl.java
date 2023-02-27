package com.movieapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movieapp.exception.ActorsNotExistException;
import com.movieapp.model.Actors;
import com.movieapp.repository.ActorsRepository;

@Service
public class ActorsServiceImpl implements ActorsService{
	
	@Autowired
	private ActorsRepository actorsRepo;

	@Override
	public Actors addActors(Actors actors) {
		 Actors save = this.actorsRepo.save(actors);
		return save;
	}

	@Override
	public Actors getActorsById(Integer id) throws ActorsNotExistException {
		Optional<Actors> findById = this.actorsRepo.findById(id);
        if (findById.isPresent()) {
            return findById.get();
        } else {
            throw new ActorsNotExistException("Actors is not present in database");
        }	 
	}

	@Override
	public List<Actors> getAllActors() {
		 List<Actors> findAll = this.actorsRepo.findAll();
		return findAll;
	}

	@Override
	public Actors updateActors(Actors actors) {
		 Actors save = this.actorsRepo.save(actors);
		return save;
	}

	@Override
	public Boolean deleteActorsById(Integer id) throws ActorsNotExistException {
		 Optional<Actors> findById = this.actorsRepo.findById(id);
		  if(findById.isPresent()) {
			   actorsRepo.deleteById(id);
			   return true;
		  }else {
			  throw new ActorsNotExistException("actors is not present in database");
		  }
		    
		  }
	@Override
	public List<Actors> getActorsByBornYear(Integer yearOfBirth) {

	    return this.actorsRepo.findByYearOfBirth(yearOfBirth);
	}

	@Override
	public List<Actors> getActorsLastNameLike(String lastName) {

	    return this.actorsRepo.findByLastName(lastName);
	}
		
	

}
