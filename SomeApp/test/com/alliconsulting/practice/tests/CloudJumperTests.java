package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.CloudJumper;

class CloudJumperTests {

	@Test
	void test_jump1() {
		CloudJumper cj = new CloudJumper();
		int[] clouds = {0,0,0,0,1,0};
		Assert.assertEquals(3,cj.jumpingOnClouds(clouds));
	}
	
	@Test
	void test_jump2() {
		CloudJumper cj = new CloudJumper();
		int[] clouds = {0,0,1,0,0,1,0}; //0 0 1 0 0 1 0
		Assert.assertEquals(4,cj.jumpingOnClouds(clouds));
	}	

	//0 0 0 1 0 0
	@Test
	void test_jump3() {
		CloudJumper cj = new CloudJumper();
		int[] clouds = {0,0,0,1,0,0}; 
		Assert.assertEquals(3,cj.jumpingOnClouds(clouds));
	}		
}
