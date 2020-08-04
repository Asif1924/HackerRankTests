package com.alliconsulting.practice.app;

public class BribeHelper {

	public void minimumBribes(int[] q) {
		int totalBribes = 0;
		int index = 0;
		for(int i=0;i<q.length;i++) {
			index = i;
			if(isOutOfPlace(q[i],i)) {
				if(numBribesForThis(q[i],i)>2) {
					System.out.println("Too chaotic");					
					break;
				}
				totalBribes+=numBribesForThis(q[i],i);
			}
			System.out.println( String.format("index:%d, number:%d, bribes:%d", i,q[i], (q[i]>i) ? numBribesForThis(q[i],i) : 0));
		}
		if(index==q.length-1)
			System.out.println(""+totalBribes);
	}
	
	public boolean isOutOfPlace(int n, int position) {
		return n!=position+1;
	}
	
	public int numBribesForThis(int n, int currentIndex) {
		return (n-currentIndex>=1) ? Math.abs(currentIndex-(n-1)) : 0;
	}
}
