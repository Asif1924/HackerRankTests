package com.alliconsulting.practice.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.AnagramHelper;

class AnagramQueryTests {

	@Test
	void test_find_anagrams() {
		AnagramHelper queryAnagrams = new AnagramHelper();
		String[] dictionary = {"hack","a","rank","khac","ackh","kran","rankhacker","a","ab","ba","stairs","raits"};
		String[] query = {"a","nark","bs","hack","stair"};
		List<String> dictList = Arrays.asList(dictionary);
		List<String> queryList = Arrays.asList(query);
		List<Integer> actuals = queryAnagrams.stringAnagram(dictList,queryList);
		
		List<Integer> expecteds = new ArrayList<Integer>() {{add(2);add(2);add(0);add(3);add(1);}};
		
		Assert.assertEquals(expecteds, actuals);
		
	}
	
	//@Test
	void test_anagram_check() {
		AnagramHelper queryAnagrams = new AnagramHelper();
		Assert.assertTrue(queryAnagrams.isAnagram("a", "a"));
		
		Assert.assertFalse(queryAnagrams.isAnagram("a", "b"));
	}
	
	@Test
	void test_find_number_of_anagrams() {
		AnagramHelper queryAnagrams = new AnagramHelper();
		
		String[] dictionary = {"hack","a","rank","khac","ackh","kran","rankhacker","a","ab","ba","stairs","raits"};
		List<String> dictList = Arrays.asList(dictionary);
		Assert.assertEquals(2,queryAnagrams.findAnagrams("a", dictList));
	}	

}
