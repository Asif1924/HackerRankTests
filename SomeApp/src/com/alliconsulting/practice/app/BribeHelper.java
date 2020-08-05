package com.alliconsulting.practice.app;

public class BribeHelper {

	/*
	 * Since the question only asks the number of bribes, 
	 * there's no need to really do a sorting, 
	 * nor element swapping, nor "bubbling up" an element. 
	 * All you need to do is to count the number of people 
	 * who overtake a person.

		void calc(vector<int> q)
		{
		    int ans = 0;
		    for (int i = q.size() - 1; i >= 0; i--) {
		        if (q[i] - (i + 1) > 2) {
		            cout << "Too chaotic" << endl;
		            return;
		        }
		        for (int j = max(0, q[i] - 2); j < i; j++)
		            if (q[j] > q[i]) ans++;
		    }
		    cout << ans << endl;
		}
	 */
	
	public void minBribes(int[] q) {
		int totalBribes = 0;
		for( int i=(q.length-1);i>=0;i-- ) {
			if(q[i] - (i+1)>2) {
				System.out.println("Too chaotic");
				return;
			}
			for(int j=Math.max(0, q[i]-2);j<i;j++) {
				if(q[j]>q[i]) totalBribes++;
			}
		}
		System.out.println(totalBribes);
	}
	
	public void minimumBribes(int[] q) {
		int totalBribes = 0;
		int index = 0;
		if(q.length>100000)
			System.out.println("Too chaotic");
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
