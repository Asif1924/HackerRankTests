package com.alliconsulting.practice.tests;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.GMCodingHelper;

class GMCodingTests {

	GMCodingHelper gch = new GMCodingHelper();
	
	//@Test
	void test_dupe_number() {
		String line="20;0,1,10,3,2,4,5,7,6,8,11,9,15,12,13,4,16,18,17,14";
		String tokens[] = line.split(";");
		
		System.out.println(tokens[0]);		
		System.out.println(tokens[1]);
	
		String numbers[] = tokens[1].split(",");		
		Assert.assertEquals("4", gch.getDupeNumber(numbers));
	}
	
	@Test
	void test_change() {
		String line = "15.94;16.00";
		//String line = "17;16.00";
		//String line = "35;35";
		
		Assert.assertEquals("NICKEL,PENNY",gch.getChange(line));
		
	}

}
