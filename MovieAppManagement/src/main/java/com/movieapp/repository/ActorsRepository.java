package com.movieapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movieapp.model.Actors;

public interface ActorsRepository extends JpaRepository<Actors,Integer> {
   
	@Query("Select actors From Actors actors Where actors.yearOfBirth>=?1")
	List<Actors> findByYearOfBirth(Integer yearOfBirth);

	@Query("SELECT actors FROM Actors actors WHERE actors.lastName LIKE ?1%")
	List<Actors> findByLastName(String lastName);
}
