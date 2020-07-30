package com.alliconsulting.practice.tests;

import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.BribeHelper;

class BribeHelperTests {

	BribeHelper bh = new BribeHelper();
	
	@Test
	void test() {
		int[] queue = {2,1,5,3,4};
		bh.minimumBribes(queue);
	}

}
