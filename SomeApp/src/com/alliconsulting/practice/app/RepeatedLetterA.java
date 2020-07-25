package com.alliconsulting.practice.app;

public class RepeatedLetterA {

	public long repeatedString(String s, Long n) {

		long numberOfAsInSubString = getNumberOfAsInString("a",s);
		long totalLengthOfSubString = s.length();
		long totalGroups = n/totalLengthOfSubString;
		
		long currentNumberOfAs = totalGroups * numberOfAsInSubString;
		long stringLengthAtThreshold = totalGroups * totalLengthOfSubString;
		long remainingToSearch = n - stringLengthAtThreshold;
		
		String remainderString = s.substring(0, (int)remainingToSearch);
		long numberOfAsInRemainderString = getNumberOfAsInString("a",remainderString);

		return currentNumberOfAs+numberOfAsInRemainderString;
	}
	
	public int getNumberOfAsInString( String target, String someString ) {
		return someString.split(target,-1).length-1;
	}

}
