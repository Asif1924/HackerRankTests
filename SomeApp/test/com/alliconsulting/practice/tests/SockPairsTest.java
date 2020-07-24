package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.SockPairs;

class SockPairsTest {

	@Test
	void test_found_pairs() {
		SockPairs sp = new SockPairs();
		int[] socks = {10,20,20,10,10,30,50,10,20};
		
		Assert.assertEquals(3, sp.sockMerchant(socks.length,socks));
	}

}
