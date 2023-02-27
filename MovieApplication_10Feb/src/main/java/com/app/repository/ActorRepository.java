package com.app.repository;

import com.app.dto.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {

    @Query("Select actor From Actor actor Where actor.year_of_birth>=?1")
    List<Actor> findByYear_Of_Birth(Integer yearOfBirth);

    @Query("SELECT actor FROM Actor actor WHERE actor.last_Name LIKE ?1%")
    List<Actor> findByLast_Name(String last_Name);
}
