package com.qa.dodgy.persistence.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Showing{
	
	@Id
	@GeneratedValue
	private Long id;

	private String startTime;
	private String screenNumber;
	private String dimension;
	
	@ManyToOne
	private Movie movie;
	
	@ManyToOne
	private Screen screen;
	
	public Showing() {
		super();
	}
	
	public Showing(String startTime, String screenNumber, String dimension, Movie movie, Screen screen) {
		super();
		this.startTime = startTime;
		this.screenNumber = screenNumber;
		this.dimension = dimension;
		this.movie = movie;
		this.screen = screen;
	}

	public Long getId() {
		return id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getScreenNumber() {
		return screenNumber;
	}

	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

}
