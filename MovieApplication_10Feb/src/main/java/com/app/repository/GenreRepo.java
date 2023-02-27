package com.app.repository;

import com.app.dto.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface GenreRepo extends JpaRepository<Genre, Integer> {
    @Query("Select genre From Genre genre where genre.name=?1")
    Optional<Genre> findByName(String name);
}
