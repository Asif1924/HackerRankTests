package com.alliconsulting.practice.tests;

import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class SomeTests {
    
    private String getLetterThatOccursTwice( String someString ){
    	String[] letters = someString.split("");
    	HashMap<String,Integer> occs = new HashMap<String,Integer>();
    	for( int i=0;i<letters.length;i++ ) {
    		if( !occs.containsKey(letters[i]))
    			occs.put(letters[i], 1);
    		else return letters[i];
    	}
        return null;
    }
	
	@Test
	void test() {
		System.out.println( getLetterThatOccursTwice("abnhgta"));
		System.out.println( getLetterThatOccursTwice("asdfghjkii"));
		System.out.println( getLetterThatOccursTwice("codility"));
		
		int array[] = {1,2,3,4};
		//for( int i=0;i<array.size(); i++ ) {
		//	System.out.println(array[i]);
		//}
		
		//int a = 123451234512345;
		
		//List list = new ArrayList();
		//list.add("hellop");
		//list.add(2);
		System.out.println( LocalDate.now());
		throw new Error();
		
	}

}



