package com.alliconsulting.practice.app;

public class BribeHelper {

	public void minimumBribes(int[] q) {
		int numBribes = 0;
		int index = 0;
		for(int i=0;i<q.length;i++) {
			index = i;
			if(isOutOfPlace(q[i],i)) {
				if(numBribesForThis(q[i],i)>2) {
					System.out.println("Too chaotic");					
					break;
				}
				numBribes+=numBribesForThis(q[i],i);
			}
		}
		if(index==q.length-1)
			System.out.println(""+numBribes);
	}
	
	public boolean isOutOfPlace(int n, int position) {
		return n!=position+1;
	}
	
	public int numBribesForThis(int n, int currentIndex) {
		return (n-currentIndex>=1) ? Math.abs(currentIndex-(n-1)) : 0;
	}
}
