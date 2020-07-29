package com.alliconsulting.practice.app;

public class Fib {

	public int getFib(int num) {
		if(num==0) return 0;
		if(num==1) return 1;
		if(num>1)
			return getFib(num-1) + getFib(num-2);
		return 0;
	}

	public void printFib(int num) {
		StringBuffer result = new StringBuffer();
		for( int i=0;i<=num;i++ ) {
			result.append(String.format("%d ",	getFib(i)));			
		}
		System.out.println( result.toString() );
	}

}
