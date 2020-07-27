package com.alliconsulting.practice.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.ClosestNumbers;

class ClosestNumbersTests {

	ClosestNumbers cn = new ClosestNumbers();
	
	@Test
	void test() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		
		cn.closestNumbers(numbers);
	}

}
