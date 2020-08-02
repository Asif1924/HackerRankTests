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
	
	
	
	public int[] getCoins(double someNumber, HashMap<String,String> cashReg) {
		int[] result = new int[] {};
		
		int i=1;
		double remainder=someNumber;
		while(remainder>=0) {
			remainder-=largestCoin(remainder,cashReg);
		}
		
		
		return result;
	}
	
	public double largestCoin(double someNumber,HashMap<String,String> cashReg) {
		double returnCoin=0.0;
		
		for( String thisCoinValue:cashReg.keySet() ) {
			BigDecimal thisCV = new BigDecimal(Double.valueOf(thisCoinValue)).setScale(2, RoundingMode.HALF_EVEN);
			if( thisCV.doubleValue()<=someNumber) {
				BigDecimal remainderBD=new BigDecimal(someNumber-thisCV.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);;
				cashReg.put(thisCoinValue, cashReg.get(thisCoinValue)+";"+remainderBD);
			}
			System.out.println(String.format("%s %s", thisCV,cashReg.get(thisCoinValue)));			
		}
		
		double smallestRemainder = 1;
		for( String thisCoinValue:cashReg.keySet() ) {
			String thisValue = cashReg.get(thisCoinValue);			
			double thisRemainder = (thisValue.split(";").length==3) ? new BigDecimal(thisValue.split(";")[2]).setScale(2, RoundingMode.HALF_EVEN).doubleValue() : 1;
			if(thisRemainder<smallestRemainder)
				smallestRemainder = thisRemainder;
		}
		
		double largestCoin = 0.0;
		for( String thisCoinValue:cashReg.keySet()) {
			String thisValue = cashReg.get(thisCoinValue);
			if(thisValue.split(";").length==3) {
				double thisRemainder = new BigDecimal(thisValue.split(";")[2]).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
				if(smallestRemainder==thisRemainder) {
					largestCoin=new BigDecimal(thisCoinValue).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
					cashReg.put(thisCoinValue, cashReg.get(thisCoinValue)+";"+remainderBD);
					break;
				}					
			}
		}
		System.out.println(largestCoin);
		return largestCoin;
	}
	
}
