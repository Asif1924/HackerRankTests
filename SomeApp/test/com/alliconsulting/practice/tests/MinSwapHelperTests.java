package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.MinSwapHelper;

class MinSwapHelperTests {

	MinSwapHelper msh = new MinSwapHelper();
	
	@Test
	void test() {
		int[] nums= {1,3,5,2,4,6,7};
		Assert.assertEquals(3,msh.minimumSwaps(nums));
	}

}
