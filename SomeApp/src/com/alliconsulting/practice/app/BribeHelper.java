package com.alliconsulting.practice.app;

public class BribeHelper {

	public void minimumBribes(int[] queue) {
		//initial state will always be 1 to queue.length
		int numberOfIncorrects=0;
		for(int i=0;i<queue.length-1;i++) {
			if(!correctOrder(queue[i],queue[i+1]) && !correctPosition(queue[i],queue[i+1],i+1,i+2)) {
				numberOfIncorrects++;
			}
		}
		System.out.println(numberOfIncorrects);
	}
	
	public boolean correctOrder(int a, int b) {
		return (a<b && b-a==1);
	}
	
	public boolean correctPosition(int a, int b, int x, int y) {
		return (a==x && b==y);
	}
	
	public int[] swap(int a, int b) {
		return new int[]{b,a};
	}

}
