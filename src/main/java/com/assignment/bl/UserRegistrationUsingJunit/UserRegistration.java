package com.assignment.bl.UserRegistrationUsingJunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	/** Method to check validation of First and last name
	 *  where regular expression of first and last name is defined 
	 *  @param Name- In this method we pass the name to check the regex pattern 
	 * @return -  The method will return true if the string passed the regex pattern or will return false*/
	
	public  boolean validForName(String name) 
    {
	
	Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
	Matcher m = p.matcher(name);
	boolean b = m.matches(); 
	
	return b;
	
    }
	
	/**Method to check validation of mobile Number
	 *  where regular expression of 10 digit mobile number is defined 
	 *  @param number- In this method we pass the number to check the regex pattern 
	 * @return -  The method will return true if the string passed the regex pattern or will return false*/
	
	 public  boolean validMobileNo(String number) {
			
			Pattern p = Pattern.compile("91 [0-9]{10}");
			Matcher m = p.matcher(number);
			boolean b = m.matches(); 
			
			return b;
			
		    }
	 /**Method to check validation of EmailId
		 *  where regular expression of emailId is defined 
		 *  @param number- In this method we pass the email id to check the regex pattern 
	     *  @return -  The method will return true if the string passed the regex pattern or will return false*/
	 
	public  boolean validEmailId(String emailid) {
			
			Pattern p = Pattern.compile("[a-z]{3,}(((.?)[+-]*(_?)*[a-z0-9]*){2,})*@[a-z0-9]{1,}.[a-z]{2,}(.[a-z]*{2,})*");
			Matcher m = p.matcher(emailid);
			boolean b = m.matches(); 
			
			return b;
			
		    }
	/** Method to check validation of password with at least one number,one upper case letter and has exactly one special character  
	  * of regex is defined 
	  * @param number- In this method we pass the password to check the regex pattern 
	  * @return -  The method will return true if the string passed the regex pattern or will return false*/
	
	 public  boolean validPassword(String password) {
			Pattern p = Pattern.compile("(?=.*[A-Z]){1}(?=.*[0-9]){1}(?=.*[!@#$&*]){1}([A-Za-z0-9]).{5,}");
			Matcher m = p.matcher(password);
			boolean b = m.matches(); 
			
			return b;
			
			}

}