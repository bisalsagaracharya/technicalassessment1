package com.movieapp.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="genres")
public class Genres implements Serializable{
    
	@Id
	@GeneratedValue 
	private int genreId;
	private String genreName;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade  = CascadeType.ALL)
	@JoinColumn(name="id")
	@JsonIgnore
	private Movie movie;
	
	 
	
	public Genres() {
		super();
	}
	 
	public Genres(int genreId, String genreName, Movie movie) {
		super();
		this.genreId = genreId;
		this.genreName = genreName;
		this.movie = movie;
	}

	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Genres [genreId=" + genreId + ", genreName=" + genreName + ", movie=" + movie + "]";
	}

	 
	
	
}
