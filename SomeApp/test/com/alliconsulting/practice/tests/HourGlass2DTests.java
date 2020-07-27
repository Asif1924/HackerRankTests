package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.HourGlass2D;

class HourGlass2DTests {

	HourGlass2D hg = new HourGlass2D();
	
	@Test
	void test() {
		int[][] inputArray = {
				{1,1,1,0,0,0},
				{0,1,0,0,0,0},
				{1,1,1,0,0,0},
				{0,0,2,4,4,0},
				{0,0,0,2,0,0},
				{0,0,1,2,4,0}
				};
		
		Assert.assertEquals(19, hg.hourglassSum(inputArray));
		//Assert.assertEquals(7, hg.findHourGlassSumAtVertex(0,0,inputArray));		
		//Assert.assertEquals(19, hg.findHourGlassSumAtVertex(2,3,inputArray));
	}

	@Test
	void test2() {
		int[][] inputArray = {
				{-9,-9,-9,1,1,1},
				{0,-9,0,4,3,2},
				{-9,-9,-9,1,2,3},
				{0,0,8,6,6,0},
				{0,0,0,-2,0,0},
				{0,0,1,2,4,0}
				};
		
		Assert.assertEquals(28, hg.hourglassSum(inputArray));
	}	
	
	@Test
	void test3() {
		int[][] inputArray = {
				{0,-4,-6,0,-7,-6},
				{-1,-2,-6,-8,-3,-1},
				{-8,-4,-2,-8,-8,-6},
				{-3,-1,-2,-5,-7,-4},
				{-3,-5,-3,-6,-6,-6},
				{-3,-6,0,-8,-6,-7}
				};
		
		Assert.assertEquals(-19, hg.hourglassSum(inputArray));		
		//Assert.assertEquals(-26, hg.findHourGlassSumAtVertex(0,0,inputArray));
		//Assert.assertEquals(-20, hg.findHourGlassSumAtVertex(0,3,inputArray));
		//Assert.assertEquals(-38, hg.findHourGlassSumAtVertex(3,0,inputArray));
	}	
	
	
}
