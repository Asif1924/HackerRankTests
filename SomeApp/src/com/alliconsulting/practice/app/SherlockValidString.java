package com.alliconsulting.practice.app;

import java.util.HashMap;

public class SherlockValidString {

	public String isValid(String testString) {
		if( testString.length()>100000) return "NO";
		testString=testString.replaceAll("\\s", ""); 
		testString=testString.toLowerCase();
		int[] freqs = new int[26];
		for(char c:testString.toCharArray()) {
			++freqs[((int)c)-'a'];
		}		
//		int oneCount=0;
//		int repeatOccurrences=0;
//		int thisFreq=0;
//		int nextFreq=0;
		int mode = findMode(freqs);				
		System.out.println( String.format("Mode of %s is %d",testString,mode));
		
		int spotsOccupiedByNumbers = 0;
		for( int i=0;i<freqs.length;i++) {
			if(freqs[i]>0) spotsOccupiedByNumbers++;
		}
		System.out.println( String.format("Spots occupied by numbers in %s is %d",testString,spotsOccupiedByNumbers));
		
		int numberOfFrequenciesOfOne = 0;
		for( int i=0;i<freqs.length;i++) {
			if(freqs[i]==1) numberOfFrequenciesOfOne++;
		}		
		System.out.println( String.format("Numbers of 1-frequencies in %s is %d",testString,numberOfFrequenciesOfOne));

		int numberOfFrequenciesOfOddOccurrences = 0;
		for( int i=0;i<freqs.length;i++) {
			if(freqs[i]%2==1) numberOfFrequenciesOfOddOccurrences++;
		}		
		System.out.println( String.format("Numbers of Odd-frequencies in %s is %d",testString,numberOfFrequenciesOfOddOccurrences));
		
		int freqOfOddOccurrence = 0;
		if(numberOfFrequenciesOfOddOccurrences==1) {
			for( int i=0;i<freqs.length;i++) {
				if(freqs[i]%2==1) freqOfOddOccurrence=freqs[i];
			}
			System.out.println( String.format("Frequency value of the only Odd-frequency in %s is %d",testString,freqOfOddOccurrence));
		}		
		
		int numberOfModesFound = 0;
		for( int i=0;i<freqs.length;i++) {
			if(freqs[i]==mode) numberOfModesFound++;
		}
		System.out.println( String.format("Numbers of modes found in %s is %d",testString,numberOfModesFound));
		System.out.println();
		System.out.println("---------------------------------");
		return (numberOfModesFound==spotsOccupiedByNumbers) ? "YES" : ((numberOfModesFound==spotsOccupiedByNumbers-1 && numberOfFrequenciesOfOne==1) ? "YES" : ((numberOfModesFound==spotsOccupiedByNumbers-1 && numberOfFrequenciesOfOddOccurrences==1) ? "YES" : "NO"));
	}
	
	public int findMode(int[] originalArray)
	{
		int[] curatedArray= originalArray;

	    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	    int max  = 1;
	    int mode = 0;
	    for(int i = 0; i < curatedArray.length; i++) {
	        if (hm.get(curatedArray[i]) != null) {
	            int count = hm.get(curatedArray[i]);
	            count++;
	            hm.put(curatedArray[i], count);
	            if(count > max) {
	                max  = count;
	                mode = curatedArray[i];
	            }
	        }
	        else if(curatedArray[i]>0)
	            hm.put(curatedArray[i],1);
	    }
	    return mode;
	}	

}
