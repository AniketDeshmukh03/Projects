package com.example.FullAPI.adminPage;

public class Admin {
	private String userName;
	private String password;
	
	public Admin() {
		
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

}
