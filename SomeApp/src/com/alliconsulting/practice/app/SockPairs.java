package com.alliconsulting.practice.app;

import java.util.HashSet;
import java.util.Set;

public class SockPairs {

	public int sockMerchant(int length, int[] socks) {
		Set<Integer> colors = new HashSet<>();
		int pairs = 0;
		for( int thisColor: socks) {
			if(!colors.contains(thisColor))
				colors.add(thisColor);
			else {
				pairs++;
				colors.remove(thisColor);
			}
		}
		return pairs;
	}

}
