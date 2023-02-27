package com.movieapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

 

@Entity
@Table(name="movie")
public class Movie implements Cloneable{
 
	@Id
	@GeneratedValue 
  private int id;
  private String title;
  private int yearOfRelease;
  private int genreId;
  
  @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.ALL} )
  @JoinTable(name="Movie_Actors",joinColumns = {@JoinColumn(name="movie_id",referencedColumnName = "id")},inverseJoinColumns = {@JoinColumn(name="actors_id",referencedColumnName = "id")})
  //@JsonIdentityReference
  private List<Actors> actors;
  
  @OneToMany(cascade = {CascadeType.ALL})
  @JoinColumn(name="id",referencedColumnName = "id")
  private List<Genres> genres;

public Movie() {
	super();
}

 

public Movie(int id, String title, int yearOfRelease, int genreId, List<Actors> actors, List<Genres> genres) {
	super();
	this.id = id;
	this.title=title;
	this.yearOfRelease = yearOfRelease;
	this.genreId = genreId;
	this.actors = actors;
	this.genres = genres;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	 this.title=title;
}

public int getYearOfRelease() {
	return yearOfRelease;
}

public void setYearOfRelease(int yearOfRelease) {
	this.yearOfRelease = yearOfRelease;
}

public int getGenreId() {
	return genreId;
}

public void setGenreId(int genreId) {
	this.genreId = genreId;
}

public List<Actors> getActors() {
	return actors;
}

public void setActors(List<Actors> actors) {
	this.actors = actors;
}

 
public List<Genres> getGenres() {
	return genres;
}



public void setGenres(List<Genres> genres) {
	this.genres = genres;
}



@Override
public String toString() {
	return "Movie [id=" + id + ", Title=" + title + ", yearOfRelease=" + yearOfRelease + ", genreId=" + genreId
			+ ", actors=" + actors + ", genres=" + genres + "]";
}

  
}
