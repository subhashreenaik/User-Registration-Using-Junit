package com.assignment.bl.UserRegistrationUsingJunit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class is for testing the regex pattern for user registration
 * @author subhashree
 *
 */
public class TestUserRegistration {
	static String[] validemail = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
    UserRegistration ur=new UserRegistration();
    
    /**
	 * In this case we are testing regex pattern for first name and last name .
	 * The assertEqual will check if the result is true or not.
	 */
	@Test
	public void testValidName() {
		assertEquals(true,ur.validForName("Subhashree") );
	}
	/**
	 * In this case we are testing regex pattern for mobile number .
	 * The assertEqual will check if the result is true or not.
	 */
	@Test
	public void testValidMobileNo() {
		assertEquals(true,ur.validMobileNo("91 2345678910") );
	}
	/**
	 * In this case we are testing regex pattern for email id .
	 * The assertEqual will check if the result is true or not.
	 */
	@Test
	public void testValidEmailid() {
		assertEquals(true,ur.validEmailId("sunima.naik@gmail.com") );
	}
	
	/**
	 * In this case we are testing regex pattern for valid password.
	 * The assertEqual will check if the result is true or not.
	 */
	@Test
	public void testValidPassword() {
		assertEquals(true,ur.validPassword("12A@asdewrt") );
	}
	
	/**
	 * In this case,it tests each email id with regex pattern.
	 */
	@Test
	public void testValidSampleEmailid() {
		for(int i=0;i < validemail.length;i++)
		assertEquals(true,ur.validEmailId(validemail[i]) );
	}
	
	
}
