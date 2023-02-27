package com.movieapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

 

@Entity
@Table(name="actors")
public class Actors {
	@Id
	@GeneratedValue 
	private int id;
	private String name;
	private String lastName;
	private int yearOfBirth;
	
	@ManyToMany(fetch  = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(name="Actors_Movie",joinColumns = {@JoinColumn(name="actors_id",referencedColumnName = "id")},inverseJoinColumns = {@JoinColumn(name="movie_id",referencedColumnName = "id")})
//	@JsonIgnore
	 
	private List<Movie> movies;
  
	 
	public Actors() {
		super();
	}

	public Actors(int id, String name, String lastName, int yearOfBirth, List<Movie> movies) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.movies = movies;
		 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	

	 

	@Override
	public String toString() {
		return "Actors [id=" + id + ", name=" + name + ", lastName=" + lastName + ", yearOfBirth=" + yearOfBirth
				+ ", movies=" + movies + "]";
	}

	 
	
    
}
