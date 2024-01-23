package com.webapp.entiry;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="first_name",nullable = false)
	private String FirstName;
	@Column(name="last_name")
	private String LastName;
	@Column(name="email",unique=true)
	private String Email;
	public Student() {
	}
	public Student(String firstName, String lastName, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	

}
