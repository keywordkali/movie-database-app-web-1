package com.movie_database.business;
import javax.persistence.*;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private   int    ID;
	private   String Title;
	private   int Year; // define instance variables
	private   String Rating;
	private   String Director;
	
	
	public Movie() {
		super();
	}






	public int getID() {
		return ID;
	}






	public void setID(int iD) {
		ID = iD;
	}






	public String getTitle() {
		return Title;
	}






	public void setTitle(String title) {
		Title = title;
	}






	public int getYear() {
		return Year;
	}






	public void setYear(int year) {
		Year = year;
	}






	public String getRating() {
		return Rating;
	}






	public void setRating(String rating) {
		Rating = rating;
	}






	public String getDirector() {
		return Director;
	}






	public void setDirector(String director) {
		Director = director;
	}






	public Movie(int iD, int year, String rating, String director) {
		super();
		ID = iD;
		Year = year;
		Rating = rating;
		Director = director;
	}


	






}
