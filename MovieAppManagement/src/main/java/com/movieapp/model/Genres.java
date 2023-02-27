package com.movieapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genres")
public class Genres {
    
	@Id
	@GeneratedValue 
	private int genreId;
	private String genreName;
	
	public Genres() {
		super();
	}
	public Genres(int genreId, String genreName) {
		super();
		this.genreId = genreId;
		this.genreName = genreName;
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
	@Override
	public String toString() {
		return "Genres [genreId=" + genreId + ", genreName=" + genreName + "]";
	}
	
	
}
