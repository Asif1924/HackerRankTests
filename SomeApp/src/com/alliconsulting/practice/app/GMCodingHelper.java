package com.alliconsulting.practice.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
	
	public String getChange(String line, HashMap<String,String> cashReg) {
		String result = "";
		String amounts[] = line.split(";");
		
		BigDecimal pp = new BigDecimal(Double.valueOf(amounts[0])).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal ch = new BigDecimal(Double.valueOf(amounts[1])).setScale(2, RoundingMode.HALF_EVEN);
		double change = 0.00;
		System.out.println(pp);
		System.out.println(ch);
				
		if(ch.doubleValue()>pp.doubleValue()) {
			change = ch.subtract(pp).doubleValue();
			double someChange[] = getAnyChange(change,cashReg);
			for( int i=0; i<someChange.length;i++ ) {
				double thisChange=someChange[i];
				result += cashReg.get(""+thisChange).split(";")[1]+( (i<someChange.length-1)? ",":"" );
			}
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
	
	public double[] getAnyChange(double someNumber, HashMap<String,String> cashReg) {
		List<Double> changeList = new ArrayList<Double>();
		
		BigDecimal remainder=new BigDecimal(someNumber).setScale(2, RoundingMode.HALF_EVEN);
		while(remainder.doubleValue()>0) {
			BigDecimal lc = new BigDecimal(getLargestChange(remainder.doubleValue(),cashReg)).setScale(2, RoundingMode.HALF_EVEN);
			remainder = remainder.subtract(lc);
			changeList.add(lc.doubleValue());
		}
		double[] result = new double[changeList.size()];
		
		for( int i=0; i<changeList.size();i++ ) {
			result[i] = changeList.get(i);	
			System.out.println( String.format("Change %d is %.2f", i,result[i]));
		}
		return result;
	}
	
	public double getLargestChange(double someNumber,HashMap<String,String> cashReg) {
		
		for( String thisCoinValue:cashReg.keySet() ) {
			BigDecimal thisCV = new BigDecimal(Double.valueOf(thisCoinValue)).setScale(2, RoundingMode.HALF_EVEN);
			String thisValue = cashReg.get(thisCoinValue);
			if( thisCV.doubleValue()<=someNumber && Integer.valueOf(thisValue.split(";")[0])==1 ) {
				BigDecimal remainderBD=new BigDecimal(someNumber-thisCV.doubleValue()).setScale(2, RoundingMode.HALF_EVEN);;
				if( cashReg.get(thisCoinValue).split(";").length==2)
					cashReg.put(thisCoinValue, cashReg.get(thisCoinValue)+";"+remainderBD);
				else if(cashReg.get(thisCoinValue).split(";").length==3 ) {
					cashReg.put(thisCoinValue, cashReg.get(thisCoinValue).split(";")[0]+";"+cashReg.get(thisCoinValue).split(";")[1]+";"+remainderBD );
				}
			}
			System.out.println(String.format("%s:::%s", thisCoinValue,cashReg.get(thisCoinValue)));				
		}
		
		double smallestRemainder = 100000.00;
		for( String thisCoinValue:cashReg.keySet() ) {
			String thisValue = cashReg.get(thisCoinValue);			
			double thisRemainder = (thisValue.split(";").length==3) ? new BigDecimal(thisValue.split(";")[2]).setScale(2, RoundingMode.HALF_EVEN).doubleValue() : smallestRemainder;
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
					cashReg.put(thisCoinValue, cashReg.get(thisCoinValue).replace("1;", "0;"));
					break;
				}					
			}
							
		}
		System.out.println(largestCoin);
		System.out.println("--------------");
		return new BigDecimal(largestCoin).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
	}
	
}
