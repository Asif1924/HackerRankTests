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

}
