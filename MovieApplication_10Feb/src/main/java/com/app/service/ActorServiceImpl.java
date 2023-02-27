package com.app.service;

import com.app.dto.Actor;
import com.app.exception.ActorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.repository.ActorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl  implements  ActorService{

    @Autowired
    private ActorRepository actorRepository;
    @Override
    public Actor addNewActor(Actor actor) {
        return this.actorRepository.save(actor);
    }

    @Override
    public Optional<Actor> getActorsById(Integer id) throws ActorException {
        Optional<Actor> findById = this.actorRepository.findById(id);
        if (findById.isEmpty()) {
            throw new ActorException("Actor for these Id not available");
        } else {
            return findById;
        }
    }

    @Override
    public List<Actor> getActorsByBornYear(Integer year_of_birth) {

        return this.actorRepository.findByYear_Of_Birth(year_of_birth);
    }

    @Override
    public List<Actor> getActorsLast_NameLike(String last_Name) {

        return this.actorRepository.findByLast_Name(last_Name);
    }
}
