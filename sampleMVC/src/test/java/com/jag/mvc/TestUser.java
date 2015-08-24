package com.jag.mvc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUser {

	@Test
	public void testValidGetUserAddress() {
		User user = new User("Jaganath", "94536");
		
		assertEquals("The address should be Fremont Address", user.getUserAddress(), "1500 White Birch Terrace");
		assertEquals("The address should be Invalid Address", user.getUserAddress(), "1500 White Birch Terrace");
	}

	@Test
	public void testInvalidGetUserAddress() {
		User user = new User("Jaganath", "94535");		
		assertEquals("The address should be Invalid Address", user.getUserAddress(), "Not a valid zipcode");
	}

}
