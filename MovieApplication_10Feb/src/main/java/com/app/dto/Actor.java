package com.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_Id")
    private Integer id;
    private String name;
    private String last_Name;
    private Integer year_of_birth;
    @ManyToMany(mappedBy = "actors")     // mapped to line 25 in Movies.dto
//    @JsonIgnore
    private List<Movies> movies = new ArrayList<>();

//    @ManyToMany(mappedBy = "actors",cascade = CascadeType.ALL)   //
//    @JsonIgnore
//    Set<Movies> movies;

    public Actor() {
    }

    public Actor(Integer id, String name, String last_Name, Integer year_of_birth, List<Movies> movies) {
        this.id = id;
        this.name = name;
        this.last_Name = last_Name;
        this.year_of_birth = year_of_birth;
        this.movies = movies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public Integer getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(Integer year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public List<Movies> getMovies() {
        return movies;
    }

    public void setMovies(List<Movies> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", year_of_birth=" + year_of_birth +
                ", movies=" + movies +
                '}';
    }
}
