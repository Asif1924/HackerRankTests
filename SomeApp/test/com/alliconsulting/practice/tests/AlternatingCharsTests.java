package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.AlternatingChars;

class AlternatingCharsTests {

	AlternatingChars ac = new AlternatingChars();
	
	@Test
	void test1() {
		String input = "AAABBB";		
		Assert.assertEquals(4, ac.alternatingCharacters(input));
	}

	@Test
	void test2() {
		String input = "AAAA";		
		Assert.assertEquals(3, ac.alternatingCharacters(input));
	}
	
	@Test
	void test3() {
		String input = "BBBBB";		
		Assert.assertEquals(4, ac.alternatingCharacters(input));
	}	
	
	@Test
	void test4() {
		String input = "ABABABAB";		
		Assert.assertEquals(0, ac.alternatingCharacters(input));
	}
	
	@Test
	void test5() {
		String input = "BABABA";		
		Assert.assertEquals(0, ac.alternatingCharacters(input));
	}	
	
}
