package com.app.controller;
import com.app.dto.Actor;
import com.app.exception.ActorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.app.service.ActorService;

import java.util.List;
import java.util.Optional;
@RestController
public class ActorController {
    @Autowired
    private ActorService actorService;

    @PostMapping("actor")
    String addNewActor(@RequestBody Actor actor) throws ActorException {

            this.actorService.addNewActor(actor);
        return "Actor got added successfully!!!";
    }

    @GetMapping("actor/{id}")
    Optional<Actor> getActorById(@PathVariable Integer id) throws ActorException {
       Optional<Actor> actor1 = this.actorService.getActorsById(id);
        return actor1;
    }

    @GetMapping("actors/{year_of_birth}")
    List<Actor> getActorsBornAfterYear(@PathVariable Integer year_of_birth){
        List<Actor> list = this.actorService.getActorsByBornYear(year_of_birth);
        return list;
    }

    @GetMapping("actors/nameslike/{last_Name}")
    List<Actor> getActorsNamesLikes(@PathVariable String last_Name){
        List<Actor> list = this.actorService.getActorsLast_NameLike(last_Name);
        return list;
    }

}