package com.project.customeronboarding.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class User {
	Integer id;
	@Size(min=2, message = "Name should have atleast 2 characters")
	@JsonProperty("user_name")
	String name;
	@Email(message = "Email should be valid")
	@JsonProperty("email")
	String email;
	String password;
	
	public User() {
		super();
	}

	public User(Integer id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
