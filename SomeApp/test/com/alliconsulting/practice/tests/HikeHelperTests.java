package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.HikeHelper;

class HikeHelperTests {

	@Test
	void test_find_valleys() {
		HikeHelper hh = new HikeHelper();
		String hikePath = "UDDDUDUU";
		Assert.assertEquals(1,hh.countingValleys(hikePath.length(),hikePath));
	}
	
	@Test
	void test_find_valleys2() {
		HikeHelper hh = new HikeHelper();
		String hikePath = "DDUUUUDD";
		Assert.assertEquals(1,hh.countingValleys(hikePath.length(),hikePath));
	}	

	@Test
	void test_find_valleys3() {
		HikeHelper hh = new HikeHelper();
		String hikePath = "DDUUUUDDDDUU";
		Assert.assertEquals(2,hh.countingValleys(hikePath.length(),hikePath));
	}	
	
	@Test
	void test_find_valleys4() { // Alex
		HikeHelper hh = new HikeHelper();
		String hikePath = "UUDDUUDDUUDDDDDDUUDDUUUUDDDDUU";
		Assert.assertEquals(2,hh.countingValleys(hikePath.length(),hikePath));
	}
	
	@Test
	void test_find_valleys5() {
		HikeHelper hh = new HikeHelper();
		String hikePath = "DDUUDDUDUUUD";
		Assert.assertEquals(2,hh.countingValleys(hikePath.length(),hikePath));
	}
	
	@Test
	void test_find_valleys6() {
		HikeHelper hh = new HikeHelper();
		String hikePath = "UDUDUDUUDDDDUUDDUUDDUUDDDDUUDDUUUU";
		Assert.assertEquals(4,hh.countingValleys(hikePath.length(),hikePath));
	}	
	
	@Test
	void test_find_valleys7() {
		HikeHelper hh = new HikeHelper();
		String hikePath = "UD";
		Assert.assertEquals(0,hh.countingValleys(hikePath.length(),hikePath));
	}		
	
}
