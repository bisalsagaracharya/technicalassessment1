package org.example;

import java.time.LocalDate;

public class Movie {

	private String movieId;
	private String movieName;
	private String language;
	private Integer releaseIn;
	private Double revenueInDollars;

	public Movie(String movieId, String movieName, String language, Integer releaseIn, Double revenueInDollars) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.releaseIn = releaseIn;
		this.revenueInDollars = revenueInDollars;
	}

	public Movie() {
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getReleaseIn() {
		return releaseIn;
	}

	public void setReleaseIn(Integer releaseIn) {
		this.releaseIn = releaseIn;
	}

	public Double getRevenueInDollars() {
		return revenueInDollars;
	}

	public void setRevenueInDollars(Double revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}

	@Override
	public String toString() {
		return "Movie{" + "movieId='" + movieId + '\'' + ", movieName='" + movieName + '\'' + ", language='" + language
				+ '\'' + ", releaseIn=" + releaseIn + ", revenueInDollars=" + revenueInDollars + '}';
	}
}
