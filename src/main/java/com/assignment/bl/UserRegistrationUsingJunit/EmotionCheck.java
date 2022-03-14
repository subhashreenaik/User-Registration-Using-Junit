package com.assignment.bl.UserRegistrationUsingJunit;

public class EmotionCheck {

	
	public String enalyzeEmotion(String emotion) {
		if(emotion.contains("happy")) {
			return "Entry Sucsessful";
		}
		else {
			return "Entry Failed";
			
		}
	}
}
