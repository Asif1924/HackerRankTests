package com.alliconsulting.practice.tests;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.SpecialSubstring;

class GMCodingTests {

	SpecialSubstring ss = new SpecialSubstring();
	
	//@Test
	void test() {
		String line="20;0,1,10,3,2,4,5,7,6,8,11,9,15,12,13,4,16,18,17,14";
		String tokens[] = line.split(";");
		
		System.out.println(tokens[0]);		
		System.out.println(tokens[1]);
		
		String numbers[] = tokens[1].split(",");		
		String dupe = "";
		HashMap<String,Integer> occurs = new HashMap<String,Integer>();
		for(int i=0;i<numbers.length;i++) {
			if(!occurs.containsKey(numbers[i])) 
				occurs.put(numbers[i],1);			
			else if( occurs.containsKey(numbers[i])) {
				dupe = numbers[i];
				break;
			}
		}
		
		System.out.println(dupe);
	}
	
	@Test
	void test2() {
		String result = "";
		String line = "15.94;16.00";
		//String line = "17;16.00";
		//String line = "35;35";
		String amounts[] = line.split(";");
		HashMap<String,Double> cashReg = new HashMap<String,Double>();
		cashReg.put("PENNY", 0.01);
		cashReg.put("NICKEL", 0.05);
		cashReg.put("DIME", 0.10);
		cashReg.put("QUARTER", 0.25);
		cashReg.put("HALF DOLLAR", 0.50);
		cashReg.put("ONE", 1.00);
		cashReg.put("TWO", 2.00);
		cashReg.put("FIVE", 5.00);
		cashReg.put("TEN", 10.00);
		cashReg.put("TWENTY", 20.00);
		cashReg.put("FIFTY", 50.00);
		cashReg.put("ONE HUNDRED", 100.00);
		
		Double pp = Double.valueOf(amounts[0]);
		Double ch = Double.valueOf(amounts[1]);
		Double change = 0.00;
		System.out.println(pp);
		System.out.println(ch);
		
		if(ch>pp) {
			change = ch-pp;
			//if(change.equals(Double.valueOf(0.06))) {
			if(change==0.06) {
				result="NICKEL,PENNY";
			}
			result = String.format("CHANGE %f", change);
		}		
		if(ch<pp) {
			result = "ERROR";
		}		
		if(ch.equals(pp)) {
			result = "ZERO";
		}
		
		System.out.println(result);
		
	}

}
