package com.alliconsulting.practice.app;

public class AlternatingChars {

	public int alternatingCharacters(String input) {
		int deletions=0;
		if(input.length()>100000)
			return 0;
		char thisChar='0';
		char[] charArray = input.toCharArray(); //Always declare and initialize char arrays, dont do it in the for loop
		for( int i=0;i<charArray.length-1;i++) {
			thisChar = charArray[i];
			if( thisChar==charArray[i+1]) deletions++;			
		}
		return deletions;
	}

}
