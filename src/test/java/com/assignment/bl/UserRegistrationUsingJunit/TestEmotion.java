package com.assignment.bl.UserRegistrationUsingJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmotion {

	EmotionCheck check = new EmotionCheck();
	/**
	 * This test case to check whether the user is happy.
	 * If happy then it will be true ,if sad then it will be false
	 */
	@Test
	public void testEmotion() {
		assertEquals("Entry Sucsessful",check.enalyzeEmotion("happy") );
		assertEquals("Entry Failed",check.enalyzeEmotion("sad") );
	}

}
