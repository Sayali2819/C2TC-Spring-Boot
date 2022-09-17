package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private Integer id;
	private String name;
	private String Type;
	private String password;
	
	
	public User(Integer id, String name, String type, String password) {
		super();
		this.id = id;
		this.name = name;
		this.Type = type;
		this.password = password;
	}


	public User() {
		super();
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


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Type=" + Type + ", password=" + password + "]";
	}
	
	
	
	
	
	
}
