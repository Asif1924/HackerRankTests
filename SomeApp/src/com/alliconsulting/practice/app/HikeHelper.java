package com.alliconsulting.practice.app;

public class HikeHelper {

	public int countingValleys(int n, String s) {
		if( n<2 || n>1000000 )
			return 0;
		int prevelevation, elevation=0;
		int valleys=0;
		for( char c: s.toCharArray()) {
			prevelevation=elevation;
			if(c=='U') elevation++;
			if(c=='D') elevation--;
			System.out.println(String.format("elevation = %d", elevation));
			if( prevelevation==0 && elevation==-1) valleys++;
		}
		return valleys;
	}

}
