package com.alliconsulting.practice.app;

import java.util.List;

public class ClosestNumbers {

	public void closestNumbers(List<Integer> numbers) {
		
		int diff = 100000;
		for(int i=0;i<numbers.size();i++) {
			for( int j=i+1;j<numbers.size();j++) {
				if( Math.abs(numbers.get(i)-numbers.get(j))<diff ) {
					diff = Math.abs(numbers.get(i)-numbers.get(j));
					System.out.println( String.format("%d %d", numbers.get(i), numbers.get(j)));
				}
			}				
		}
	}

}
