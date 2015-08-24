package com.jag.mvc;

public class User{
	
	private long userId;
	private String userName;
	private String userZipCode;
	private String userAddress;

	
	
	public User(String userName, String userZipCode) {
		this.userName = userName;
		this.userZipCode = userZipCode;
	}
	
	public String getUserAddress() {
		

		if (this.userZipCode.equals("94536")) {
			this.userAddress = "1500 White Birch Terrace";
		}	
		else {
			this.userAddress = "Not a vaid zipcode";
		}
		
		return this.userAddress;
		
	}
	
	

}
