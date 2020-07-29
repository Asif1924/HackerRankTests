package com.alliconsulting.practice.tests;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.ArrayRotation;

class ArrayRotationTests {

	ArrayRotation ar = new ArrayRotation();
	
	@Test
	void test() {
		int[] inputArray = {1,2,3,4,5};
		int rots = 4;
		int[] expected = {5,1,2,3,4};
		boolean result = Arrays.equals(expected,ar.rotLeft(inputArray, rots));
		Assert.assertTrue(result);
	}

}
