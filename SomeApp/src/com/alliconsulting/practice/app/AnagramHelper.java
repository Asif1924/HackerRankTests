package com.alliconsulting.practice.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramHelper {

	public List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
		List<Integer> results = new ArrayList<Integer>();
		for( String thisWord:query) {
			results.add(findAnagrams(thisWord,dictionary));
		}
		return results;
	}

	public int findAnagrams(String thisWord, List<String> dictionary) {
		int anaCount = 0;
		for(String dictWord:dictionary) {
			if( isAnagram(thisWord,dictWord) ) anaCount++;
		}
		return anaCount;
	}
	
	public boolean isAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");
            return true;
        }
        System.out.println(s1 + " and " + s2 + " are not anagrams");
        return false;
    }  	

}
