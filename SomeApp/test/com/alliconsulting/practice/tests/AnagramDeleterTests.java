package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.AnagramDeleter;

class AnagramDeleterTests {

	AnagramDeleter ad = new AnagramDeleter();

	@Test
	void test1() {
		String string1 = "cde";
		String string2 = "abc";
		
		Assert.assertEquals(4,ad.makeAnagram(string1,string2));
	}
	
	@Test
	void test2() {
		String string1 = "aaa";
		String string2 = "aaa";
		
		Assert.assertEquals(0,ad.makeAnagram(string1,string2));
	}	
	
	@Test
	void test() {
		String string1 = "angeredforhim";
		String string2 = "enragedtoosoon";
		
		Assert.assertEquals(11,ad.makeAnagram(string1,string2));
	}

}
