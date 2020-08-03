package com.alliconsulting.practice.tests;

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
		HashMap<String,String> cashReg = new HashMap<String,String>();
		cashReg.put(""+0.01,"1;PENNY");
		cashReg.put(""+0.05,"1;NICKEL");
		cashReg.put(""+0.10,"1;DIME");
		cashReg.put(""+0.25,"1;QUARTER");
		cashReg.put(""+0.50,"1;HALF DOLLAR");
		cashReg.put(""+1.00,"1;ONE");
		cashReg.put(""+2.00,"1;TWO");
		cashReg.put(""+5.00,"1;FIVE");
		cashReg.put(""+10.00,"1;TEN");
		cashReg.put(""+20.00,"1;TWENTY");
		cashReg.put(""+50.00,"1;FIFTY");
		cashReg.put(""+100.00,"1;ONE HUNDRED");		

		Assert.assertEquals("NICKEL,PENNY",gch.getChange(line, cashReg));
	}
	
	@Test
	void test_change2() {
		String line = "17;16.00";
		HashMap<String,String> cashReg = new HashMap<String,String>();
		cashReg.put(""+0.01,"1;PENNY");
		cashReg.put(""+0.05,"1;NICKEL");
		cashReg.put(""+0.10,"1;DIME");
		cashReg.put(""+0.25,"1;QUARTER");
		cashReg.put(""+0.50,"1;HALF DOLLAR");
		cashReg.put(""+1.00,"1;ONE");
		cashReg.put(""+2.00,"1;TWO");
		cashReg.put(""+5.00,"1;FIVE");
		cashReg.put(""+10.00,"1;TEN");
		cashReg.put(""+20.00,"1;TWENTY");
		cashReg.put(""+50.00,"1;FIFTY");
		cashReg.put(""+100.00,"1;ONE HUNDRED");		
		
		Assert.assertEquals("ERROR",gch.getChange(line, cashReg));
	}	

	@Test
	void test_change3() {
		String line = "35;35";
		HashMap<String,String> cashReg = new HashMap<String,String>();
		cashReg.put(""+0.01,"1;PENNY");
		cashReg.put(""+0.05,"1;NICKEL");
		cashReg.put(""+0.10,"1;DIME");
		cashReg.put(""+0.25,"1;QUARTER");
		cashReg.put(""+0.50,"1;HALF DOLLAR");
		cashReg.put(""+1.00,"1;ONE");
		cashReg.put(""+2.00,"1;TWO");
		cashReg.put(""+5.00,"1;FIVE");
		cashReg.put(""+10.00,"1;TEN");
		cashReg.put(""+20.00,"1;TWENTY");
		cashReg.put(""+50.00,"1;FIFTY");
		cashReg.put(""+100.00,"1;ONE HUNDRED");		
		
		Assert.assertEquals("ZERO",gch.getChange(line, cashReg));
	}	
	
	@Test
	void test_change4() {
		String line = "35;37";
		HashMap<String,String> cashReg = new HashMap<String,String>();
		cashReg.put(""+0.01,"1;PENNY");
		cashReg.put(""+0.05,"1;NICKEL");
		cashReg.put(""+0.10,"1;DIME");
		cashReg.put(""+0.25,"1;QUARTER");
		cashReg.put(""+0.50,"1;HALF DOLLAR");
		cashReg.put(""+1.00,"1;ONE");
		cashReg.put(""+2.00,"1;TWO");
		cashReg.put(""+5.00,"1;FIVE");
		cashReg.put(""+10.00,"1;TEN");
		cashReg.put(""+20.00,"1;TWENTY");
		cashReg.put(""+50.00,"1;FIFTY");
		cashReg.put(""+100.00,"1;ONE HUNDRED");		
		
		Assert.assertEquals("TWO",gch.getChange(line, cashReg));
	}	
	
	@Test
	void test_change5() {
		String line = "100;250";
		HashMap<String,String> cashReg = new HashMap<String,String>();
		cashReg.put(""+0.01,"1;PENNY");
		cashReg.put(""+0.05,"1;NICKEL");
		cashReg.put(""+0.10,"1;DIME");
		cashReg.put(""+0.25,"1;QUARTER");
		cashReg.put(""+0.50,"1;HALF DOLLAR");
		cashReg.put(""+1.00,"1;ONE");
		cashReg.put(""+2.00,"1;TWO");
		cashReg.put(""+5.00,"1;FIVE");
		cashReg.put(""+10.00,"1;TEN");
		cashReg.put(""+20.00,"1;TWENTY");
		cashReg.put(""+50.00,"1;FIFTY");
		cashReg.put(""+100.00,"1;ONE HUNDRED");		
		
		Assert.assertEquals("ONE HUNDRED,FIFTY",gch.getChange(line, cashReg));
	}	
	
}
