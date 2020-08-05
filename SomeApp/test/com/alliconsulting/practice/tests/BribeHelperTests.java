package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.BribeHelper;

class BribeHelperTests {

	BribeHelper bh = new BribeHelper();
	
	@Test
	void test() {
		int[] queue = {2,1,5,3,4};
		bh.minimumBribes(queue);
	}
	
	@Test
	void test2() {
		int[] queue = {2,5,1,3,4};
		bh.minimumBribes(queue);
	}
	
	@Test
	void test3() {
		int[] queue = {5,1,2,3,7,8,6,4};
		bh.minimumBribes(queue);
	}
	
	@Test
	void test4() {
		int[] queue = {1,2,5,3,7,8,6,4};
		bh.minimumBribes(queue);
	}
	
	//5 1 2 3 7 8 6 4
	//1 2 5 3 7 8 6 4
}
