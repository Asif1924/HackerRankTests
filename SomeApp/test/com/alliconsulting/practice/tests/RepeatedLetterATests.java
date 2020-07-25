package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.RepeatedLetterA;

class RepeatedLetterATests {

	RepeatedLetterA rpa = new RepeatedLetterA();

	@Test
	void test_private() {		
		Assert.assertEquals(3,rpa.getNumberOfAsInString("a","asdfsdfassdfsdfasdfsdfsA"));
	}
	
	
	@Test
	void test1() {
		String theString = "a";
		Long limitStr = 1000000000000l;
		
		Assert.assertEquals(1000000000000l,rpa.repeatedString(theString,limitStr));
	}

	//@Test
	void test2() {
		String theString = "aba";
		Long limitStr = 10l;
		
		Assert.assertEquals(7,rpa.repeatedString(theString,limitStr));
	}
	
}
