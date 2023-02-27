package com.movieapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movieapp.model.Genres;

public interface GenresRepository extends JpaRepository<Genres,	Integer> {
	@Query("Select genres From Genres genres where genres.genreName=?1")
	Optional<Genres> findByName(String name);
}
