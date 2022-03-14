package com.assignment.bl.UserRegistrationUsingJunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	/** Method to check validation of First and last name
	 *  where regular expression of first and last name is defined 
	 *  @param Name- In this method we pass the name to check the regex pattern 
	 * @return -  The method will return true if the string passed the regex pattern or will return false
	 * @throws Here UserRegistrationException is used if it will give false*/
	
	public  boolean validForName(String name) throws UserRegistrationException
    {
	
	Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
	Matcher m = p.matcher(name);
	boolean b = m.matches(); 
	if(b == true) {
		return b;
	}
	else {
		throw new UserRegistrationException("give proper Name");
	}
	
    }
	
	/**Method to check validation of mobile Number
	 *  where regular expression of 10 digit mobile number is defined 
	 *  @param number- In this method we pass the number to check the regex pattern 
	 * @return -  The method will return true if the string passed the regex pattern or will return false
	 * @throws Here UserRegistrationException is used if it will give false*/
	
	 public  boolean validMobileNo(String number) throws UserRegistrationException {
			
			Pattern p = Pattern.compile("91 [0-9]{10}");
			Matcher m = p.matcher(number);
			boolean b = m.matches(); 
			if(b == true) {
				return b;
			}
			else {
				throw new UserRegistrationException("give proper mobile number");
			}
			
		    }
	 /**Method to check validation of EmailId
		 *  where regular expression of emailId is defined 
		 *  @param number- In this method we pass the email id to check the regex pattern 
	     *  @return -  The method will return true if the string passed the regex pattern or will return false
	 * @throws Here UserRegistrationException is used if it will give false*/
	 
	public  boolean validEmailId(String emailid) throws UserRegistrationException {
			
			Pattern p = Pattern.compile("^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,}([.][a-z]{2,})?$");
			Matcher m = p.matcher(emailid);
			boolean b = m.matches(); 
			
			if(b == true) {
				return b;
			}
			else {
				throw new UserRegistrationException("give proper emailid");
			}
			
		    }
	/** Method to check validation of password with at least one number,one upper case letter and has exactly one special character  
	  * of regex is defined 
	  * @param number- In this method we pass the password to check the regex pattern 
	  * @return -  The method will return true if the string passed the regex pattern or will return false
	 * @throws Here UserRegistrationException is used if it will give false*/
	
	 public  boolean validPassword(String password) throws UserRegistrationException {
			Pattern p = Pattern.compile("(?=.*[A-Z]){1}(?=.*[0-9]){1}(?=.*[!@#$&*]){1}([A-Za-z0-9]).{5,}");
			Matcher m = p.matcher(password);
			boolean b = m.matches(); 
			if(b == true) {
				return b;
			}
			else {
				throw new UserRegistrationException("give valid password");
			}
			
		    }

}
