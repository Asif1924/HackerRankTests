package com.alliconsulting.practice.app;

import java.util.List;

public class PaperCuttings {

	public long paperCuttings(int textLength, List<Integer> starting, List<Integer> ending) {
		long result=0;
		if( textLength<1 && textLength>1000000000) return 0;
		if( starting.size()!=ending.size()) return 0;
		for(int i=0;i<ending.size()-1;i++) {
			for(int j=0;j<starting.size();j++)
			 if(ending.get(i)<starting.get(j)) result++;
		}
		
		return result;
	}

}
