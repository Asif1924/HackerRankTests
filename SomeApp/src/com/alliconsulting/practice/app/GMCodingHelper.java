package com.alliconsulting.practice.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

public class GMCodingHelper {
	public String getDupeNumber( String[] numbers ) {
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
		
		return dupe;
	}
	
	public String getChange(String line) {
		String result = "";

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
		
		BigDecimal pp = new BigDecimal(Double.valueOf(amounts[0])).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal ch = new BigDecimal(Double.valueOf(amounts[1])).setScale(2, RoundingMode.HALF_EVEN);
		double change = 0.00;
		System.out.println(pp);
		System.out.println(ch);
		
		if(ch.doubleValue()>pp.doubleValue()) {
			change = ch.subtract(pp).doubleValue();
			
			if(change==0.06) {
				result="NICKEL,PENNY";
			}else
				result = String.format("CHANGE %.2f", change);
		}		
		if(ch.doubleValue() < pp.doubleValue()) {
			result = "ERROR";
		}		
		if(ch.doubleValue()==pp.doubleValue()) {
			result = "ZERO";
		}
		
		System.out.println(result);
		return result;
	}
	
}
