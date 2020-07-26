package com.alliconsulting.practice.app;

import java.util.Arrays;

public class AnagramDeleter {

	public int makeAnagram(String string1, String string2) {
		string1 = string1.replaceAll("\\s", "");  
        string2 = string2.replaceAll("\\s", "");  
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
		int deletions = 0;

		int[] freq = new int[26];
		for(char c:string1.toCharArray()) {
			++freq[((int)c)-'a'];
		}
		for(char c:string2.toCharArray()) {
			--freq[((int)c)-'a'];
		}
		for(int val: freq) {
			deletions+=Math.abs(val);
		}
		return deletions;
	}
	
}
