package com.alliconsulting.practice.app;

import java.util.HashMap;

public class SherlockValidString {

	public String isValid(String testString) {
		if( testString.length()>100000) return "NO";
		testString=testString.replaceAll("\\s", ""); 
		testString=testString.toLowerCase();
		if( testString.length()==1) return "YES";
		
		int[] freqs = new int[26];
		for(char c:testString.toCharArray()) {
			++freqs[((int)c)-'a'];
		}
		
		int mode = findModeOfNonZeroValues(freqs);				
//		System.out.println( String.format("Mode of %s is %d",testString,mode));
		
		int numberOfModesFound = 0;
		int spotsOccupiedByNumbers = 0;
		int numberOfFrequenciesOfOne = 0;
		int numberOfFrequenciesOfOddOccurrences = 0;
		int freqOfOddOccurrence = 0;
		for( int i=0;i<freqs.length;i++) {
			if(freqs[i]==mode) numberOfModesFound++;
			if(freqs[i]>0) spotsOccupiedByNumbers++;
			if(freqs[i]==1) numberOfFrequenciesOfOne++;
			if(freqs[i]%2==1) numberOfFrequenciesOfOddOccurrences++;			
		}
//		System.out.println( String.format("Numbers of modes found in %s is %d",testString,numberOfModesFound));
//		System.out.println( String.format("Spots occupied by numbers in %s is %d",testString,spotsOccupiedByNumbers));
//		System.out.println( String.format("Numbers of 1-frequencies in %s is %d",testString,numberOfFrequenciesOfOne));
//		System.out.println( String.format("Numbers of Odd-frequencies in %s is %d",testString,numberOfFrequenciesOfOddOccurrences));

		if(numberOfFrequenciesOfOddOccurrences==1) {
			for( int i=0;i<freqs.length;i++) {
				if(freqs[i]%2==1) freqOfOddOccurrence=freqs[i];
			}
//			System.out.println( String.format("Frequency value of the only Odd-frequency in %s is %d",testString,freqOfOddOccurrence));
		}		
//		System.out.println();
//		System.out.println("---------------------------------");
		
		if(numberOfModesFound==spotsOccupiedByNumbers)
			return "YES";
		else if (numberOfModesFound==spotsOccupiedByNumbers-1 && numberOfFrequenciesOfOne==1)
			return "YES";
		else if(numberOfModesFound==spotsOccupiedByNumbers-1 && numberOfFrequenciesOfOddOccurrences==1 && freqOfOddOccurrence==mode+1)
			return "YES";
		
		return "NO";
	}
	
	public int findModeOfNonZeroValues(int[] originalArray)
	{
	    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	    int max  = 1;
	    int mode = 0;
	    for(int i = 0; i < originalArray.length; i++) {
	        if (hm.get(originalArray[i]) != null) {
	            int count = hm.get(originalArray[i]);
	            count++;
	            hm.put(originalArray[i], count);
	            if(count > max) {
	                max  = count;
	                mode = originalArray[i];
	            }
	        }
	        else if(originalArray[i]>0)
	            hm.put(originalArray[i],1);
	    }
	    return mode;
	}	

}
