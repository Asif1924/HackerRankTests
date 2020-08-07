package com.alliconsulting.practice.app;

import java.util.HashMap;

public class MinSwapHelper {

	/*
	 * 	Given array 
		After swapping  we get 
		After swapping  we get 
		After swapping  we get 
		So, we need a minimum of  swaps to sort the array in ascending order.
	 */
	
	public int minimumSwaps(int[] arr) {
		int minswaps = 0;
		HashMap<Integer,Integer> loc = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			loc.put(arr[i],i);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=(i+1)) {
				swap(i,arr[i],loc,arr);
				minswaps++;
			}
		}
		
		return minswaps;
	}
	public void swap(int actualIndex, int wrongNumber, HashMap<Integer,Integer> loc, int[] arr) {
		int indexWhereNumberReallyIs=loc.get(actualIndex+1);
		arr[actualIndex]=arr[indexWhereNumberReallyIs];
		arr[indexWhereNumberReallyIs]=wrongNumber;
		loc.put(wrongNumber,indexWhereNumberReallyIs);
	}
}
