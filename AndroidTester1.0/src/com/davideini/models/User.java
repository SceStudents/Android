package com.davideini.models;

import com.davideini.DataBase.DbContext;
import com.davideini.models.location.Location;

public class User {

	// private variables
	private String username;

	public User() {
		DbContext db = new DbContext();
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
