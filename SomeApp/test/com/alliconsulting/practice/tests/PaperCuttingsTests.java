package com.alliconsulting.practice.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.PaperCuttings;

class PaperCuttingsTests {

	PaperCuttings pc = new PaperCuttings();
	
	@Test
	void test() {
		int textLength = 10;
		List<Integer> starting = new ArrayList<Integer>() {{
									add(1);
									add(1);
									add(6);
									add(7);
									}};		
		List<Integer> ending = new ArrayList<Integer>() {{
									add(5);
									add(3);
									add(8);
									add(10);
									}};		
		
		Assert.assertEquals(4l, pc.paperCuttings(textLength,starting,ending));
	}
	
	@Test
	void test2() {
		int textLength = 10;
		List<Integer> starting = new ArrayList<Integer>() {{
									add(3);
									add(1);
									add(2);
									add(8);
									add(8);
									}};		
		List<Integer> ending = new ArrayList<Integer>() {{
									add(5);
									add(3);
									add(7);
									add(10);
									add(10);
									}};		
		
		Assert.assertEquals(3l, pc.paperCuttings(textLength,starting,ending));
	}	
	
	@Test
	void test3() {
		int textLength = 8;
		List<Integer> starting = new ArrayList<Integer>() {{
									add(3);
									add(4);
									add(5);
									add(6);
									add(8);
									}};		
		List<Integer> ending = new ArrayList<Integer>() {{
									add(4);
									add(5);
									add(6);
									add(7);
									add(8);
									}};		
		
		Assert.assertEquals(7l, pc.paperCuttings(textLength,starting,ending));
	}		
	

}
