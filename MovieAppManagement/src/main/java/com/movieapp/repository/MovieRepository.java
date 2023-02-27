package com.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movieapp.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
	@Query("Select movie from Movie movie where movie.Title=?1")
	Movie findByTitle(String Title);
	
	

}
