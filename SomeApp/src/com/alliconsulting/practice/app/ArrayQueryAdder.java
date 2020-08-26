package com.alliconsulting.practice.app;

import java.util.HashMap;

public class ArrayQueryAdder {
	/*
	 *  a b k
    	1 5 3
    	4 8 7
    	6 9 1
    	
    	
index->	 1 2 3  4  5 6 7 8 9 10
		[0,0,0, 0, 0,0,0,0,0, 0]
		[3,3,3, 3, 3,0,0,0,0, 0]
		[3,3,3,10,10,7,7,7,0, 0]
		[3,3,3,10,10,8,8,8,1, 0]
    	
    	long arrayManipulation(int n, int[][] queries) {
    	1<=a<=b<=n
	 */
	
	public long arrayManipulation(int n, int[][] queries) {
		if(n<3 && n>10000000) return 0;
		int height = queries.length;
		if( height<1 && height > (2*100000)) return 0;

	    int[] controlArray = new int[n];
	    int largest = 0;
		for(int y=0;y<height;y++) {
			if(queries[y][0]<1 && queries[y][1] <1)
				return 0;
			if(queries[y][0]> queries[y][1])
				return 0;
			for(int i=(queries[y][0])-1;i<(queries[y][1]);i++) {
				controlArray[i]+=queries[y][2];
				if(controlArray[i]>largest)
					largest=controlArray[i];
			}
		}
		return largest;
	}
	
	public long arrayManipulation2(int n, int[][] queries) {
		if(n<3 && n>10000000) return 0;
		
		int height = queries.length;
		if( height<1 && height > (2*100000)) return 0;

	    long largest = findSumOfHighestOverlapOfNumberRanges(queries);
		return largest;
	}

	public long findSumOfHighestOverlapOfNumberRanges(int[][] queries) {
		
		return 0;
	}	

}
