package com.alliconsulting.practice.app;

public class ArrayRotation {
	public int[] rotLeft(int[] a, int d) {
		int[] result = {};
		if( a.length<1 || a.length>100000 )
			return result;
		if( d>a.length )
			return result;
		
		result = new int[a.length];
		int i=d;
		int n=0;
		while(n<a.length) {
			result[n]=a[i];
			n++;
			i++;i%=a.length;
		}
		return result;
	}
}
