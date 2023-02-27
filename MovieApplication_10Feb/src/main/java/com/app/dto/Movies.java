package com.app.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "movies_Id")
    private Integer id;
    private String title;
    private Integer year_of_release;


    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Movie_Actors",
            joinColumns = { @JoinColumn(name = "id") },// Main class
            inverseJoinColumns = { @JoinColumn(name = "actor_Id") } // Sub class
    )
    @JsonBackReference
    private List<Actor> actors= new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movies_Id", referencedColumnName = "genre_Id")
    private Genre genre;


//    @ManyToMany(cascade = CascadeType.ALL)
//    Set<Actor> actors;

//    @OneToOne(cascade = CascadeType.ALL)
//    private Genre genre;
    public Movies() {
    }
    public Movies(Integer id, String title, Integer year_of_release, List<Actor> actors, Genre genre) {
        this.id = id;
        this.title = title;
        this.year_of_release = year_of_release;
        this.actors = actors;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear_of_release() {
        return year_of_release;
    }

    public void setYear_of_release(Integer year_of_release) {
        this.year_of_release = year_of_release;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year_of_release=" + year_of_release +
                ", actors=" + actors +
                ", genre=" + genre +
                '}';
    }
}
