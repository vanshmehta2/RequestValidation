package com.example.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

//data annotation is used for lombok & lombok having some annotations inside it like getter setter etc
@Data
//Entity tag is used to make this java class as JPA Entity and we can use it for database
@Entity
// table annotation is used to provide the table name,. if we wil not provide the table name. class name will the table name 
@Table(name="empoly")
public class Employee {
	//id annotation is used to make any field primary key of the table 
	//generatedValue is used to generate the value by logic we write inside it
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "First Name can not be null")
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Email(message = "invalid email address")
	@Column(name="email_")
	private String email;
	
	@NotNull
	@Pattern(regexp = "^\\d{10}$", message = "entered mobile numberis inavlid ")
	@Column(name = "mobile")
	private String mobile;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
