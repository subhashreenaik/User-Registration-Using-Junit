package com.assignment.bl.UserRegistrationUsingJunit;

public class UserRegistrationException extends Exception{
    public String message;
	public UserRegistrationException(String message) {
		this.message=message;
	}

}

