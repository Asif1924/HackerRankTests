package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.TurnBook;

class TurnBookTests {

	TurnBook tb = new TurnBook();
	@Test
	void test_min_turns_pages5_lookfor2() {		
		Assert.assertEquals(1, tb.pageCount(5,2));
	}
	@Test
	void test_min_turns_pages5_lookfor4() {
		Assert.assertEquals(0, tb.pageCount(5,4));
	}
	@Test
	void test_min_turns_pages6_lookfor2() {
		Assert.assertEquals(1, tb.pageCount(6,2));
	}
	@Test
	void test_min_turns_pages1_lookfor1() {
		Assert.assertEquals(0, tb.pageCount(1,1));
	}
	@Test
	void test_min_turns_pages10_lookfor7() {
		Assert.assertEquals(2, tb.pageCount(10,7));
	}
	@Test
	void test_min_turns_pages10_lookfor5() {
		Assert.assertEquals(2, tb.pageCount(10,5));
	}
	
}
