package com.movieapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.exception.GenresNotExistException;
import com.movieapp.model.Genres;
import com.movieapp.repository.GenresRepository;

@Service
public class GenresServiceImpl implements GenresService {
        
	@Autowired
	private GenresRepository genresRepo;
	
	
	@Override
	public Genres addGenres(Genres genres) {
		 Genres save = this.genresRepo.save(genres);
		return save;
	}

	@Override
	public Genres getGenresById(Integer id) throws GenresNotExistException {
		   Optional<Genres> findById = this.genresRepo.findById(id);
		   if(findById.isPresent()) {
			   return findById.get();
		   }else {
			throw new GenresNotExistException("Geners is not present in database");
		}
		
	}

	@Override
	public List<Genres> getAllGenres() {
		 List<Genres> findAll = this.genresRepo.findAll();
		return findAll;
	}

	@Override
	public Genres updateGenres(Genres genres) {
		 Genres save = this.genresRepo.save(genres);
		return save;
	}

	@Override
	public Boolean deleteGenresById(Integer id) throws GenresNotExistException {
	     Optional<Genres> findById = this.genresRepo.findById(id);
	     if(findById.isPresent()) {
	    	this.genresRepo.deleteById(id);
	    	return true;
	     }else {
	    	 throw new GenresNotExistException("Geners is not present");
		}
		 
	}

	@Override
	public Optional<Genres> getGeneresByName(String name) {
		  Optional<Genres> foundByName = this.genresRepo.findByName(name);
		    return foundByName;
		
	}
	

}
