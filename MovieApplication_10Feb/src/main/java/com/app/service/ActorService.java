package com.app.service;

import com.app.dto.Actor;
import com.app.exception.ActorException;

import java.util.List;
import java.util.Optional;


public interface ActorService {
    Actor addNewActor(Actor actor);
    Optional<Actor> getActorsById(Integer id) throws ActorException;
    List<Actor> getActorsByBornYear(Integer year_Of_birth);
    List<Actor> getActorsLast_NameLike(String last_Name);
}
