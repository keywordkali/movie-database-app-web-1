package com.movie_database.business;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private   int    ID;
	private   String FirstName; // define instance variables
	private   String LastName;
	private   String Gender;
	private   LocalDate BirthDate;




	
	



	public Actor() {
		super();
	}









	public int getID() {
		return ID;
	}









	public void setID(int iD) {
		ID = iD;
	}









	public String getFirstName() {
		return FirstName;
	}









	public void setFirstName(String firstName) {
		FirstName = firstName;
	}









	public String getLastName() {
		return LastName;
	}









	public void setLastName(String lastName) {
		LastName = lastName;
	}









	public String getGender() {
		return Gender;
	}









	public void setGender(String gender) {
		Gender = gender;
	}









	public LocalDate getBirthDate() {
		return BirthDate;
	}









	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
	}









	public Actor(int iD, String firstName, String lastName, String gender, LocalDate birthDate) {
		super();
		ID = iD;
		FirstName = firstName;
		LastName = lastName;
		Gender = gender;
		BirthDate = birthDate;
	}









	public String displayActor() {
		String str = "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n";
		str += "-+-+-+-+-+-+-+-+-+-+-Actor-+-+-+-+-+-+-+-+-+-+-+-+-+\n";
		str += "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-\n";
		str += "Actor ID: \t\t\t" + ID + " " + "\n";
		str += "Actor Name:\t\t" + FirstName + " " + LastName + "\n";
		str += "Gender:\t\t\t\t" + (Gender.equalsIgnoreCase("M")?"Male":"Female") + "\n";
		str += "Born on:\t\t" + BirthDate + "\n";
		str += "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n";

		return str;
	}

}
