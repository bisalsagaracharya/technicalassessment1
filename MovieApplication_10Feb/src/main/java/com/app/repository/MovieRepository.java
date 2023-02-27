package com.app.repository;

import com.app.dto.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer> {
//    Movies findByName(String name);
    @Query("Select mv from Movies mv where mv.title=?1")
    Movies findByTitle(String title);

//    @Query("Select m.movies_Id, m.title,m.year_of_release, a.actor_Id From Movies as m LEFT JOIN m.actors as a")





    @Query("SELECT m.id , m.title , m.year_of_release FROM Movies m LEFT JOIN Actor a ON a.id = m.id ORDER BY m.id, a.id")


//    @Query(value = "SELECT movies_Id FROM Movies LEFT JOIN Actor ON Movies.movies_Id = Actor.actor_Id", nativeQuery = true)
    List<Movies> findByMoviesId(Integer movies_Id);

//    @Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
//            + "FROM Department d LEFT JOIN d.employees e")

//@Query("SELECT movies_Id FROM Movies LEFT JOIN Actor ON Movies.movies_Id = Actor.actor_Id")
//    List<Movies> fetchEmpDeptDataLeftJoin();
}
