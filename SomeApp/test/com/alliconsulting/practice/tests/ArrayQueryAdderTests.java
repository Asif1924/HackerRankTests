package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.ArrayQueryAdder;

class ArrayQueryAdderTests {

	ArrayQueryAdder aqa = new ArrayQueryAdder();
	
	@Test
	void test() {
		int arraySize = 10;
		int[][] query = {
				{1,5,3},
				{4,8,7},
				{6,9,1}
				};		
		
		long actual = aqa.arrayManipulation(arraySize,query);
		Assert.assertEquals(10, actual);
	}

	@Test
	void test2() {
		/*
		 * 10 4
			2 6 8
			3 5 7
			1 8 1
			5 9 15
			
			
		 1  2  3  4  5  6  7  8  9 10
		[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		[0, 8, 8, 8, 8, 8, 0, 0, 0, 0]
		[0, 8,15,15,15, 0, 0, 0, 0, 0]
		[1, 9,16,16,16, 7, 1, 1, 0, 0]
		[1, 9,16,16,31,22,16,16,15, 0]
		 */

		int arraySize = 10;
		int[][] query = {
				{2,6,8},
				{3,5,7},
				{1,8,1},
				{5,9,15}
				};		
		
		long actual = aqa.arrayManipulation(arraySize,query);
		Assert.assertEquals(31, actual);		
		
	}
	
}
