package com.alliconsulting.practice.app;

public class BribeHelper {

	public void minimumBribes(int[] q) {
		int totalBribes = 0;
		int index = 0;
		for(int i=0;i<q.length;i++) {
			index = i;
			if(isOutOfPlace(q[i],i,q)) {
				if(numBribesForThis(q[i],i,q)>2) {
					System.out.println("Too chaotic");					
					break;
				}
				totalBribes+=numBribesForThis(q[i],i,q);
			}
			//System.out.println( String.format("index:%d, number:%d, bribes:%d", i,q[i], (isOutOfPlace(q[i],i,q)) ? numBribesForThis(q[i],i,q) : 0 ));
		}
		if(index==q.length-1)
			System.out.println(""+totalBribes);
	}
	
	public boolean isOutOfPlace(int n, int position, int[] queue) {
		if( position<(queue.length-1) && n > (queue[position+1]) )
			return (true || queue[position]>queue[position+1] );
		if( position<(queue.length-1) && n > (position+1) )
			return (true || queue[position]>queue[position+1] );
		return false;
	}
	
	public int numBribesForThis(int n, int currentIndex, int[] q) {
		return Math.abs(currentIndex-(n-1));
	}
}
