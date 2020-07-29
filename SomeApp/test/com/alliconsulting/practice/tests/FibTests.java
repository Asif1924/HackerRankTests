package com.alliconsulting.practice.tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.alliconsulting.practice.app.Fib;

class FibTests {

	Fib f = new Fib();
	
	@Test
	void test_fib0() {
		Assert.assertEquals(0,f.getFib(0));
	}

	@Test
	void test_fib1() {
		Assert.assertEquals(1,f.getFib(1));
	}
	
	@Test
	void test_fib2() {
		Assert.assertEquals(1,f.getFib(2));
	}

	@Test
	void test_fib3() {
		Assert.assertEquals(2,f.getFib(3));
	}
	
	@Test
	void test_fib4() {
		Assert.assertEquals(3,f.getFib(4));
	}

	@Test
	void test_fib5() {
		Assert.assertEquals(5,f.getFib(5));
	}	
	
	@Test
	void test_fib6() {
		Assert.assertEquals(8,f.getFib(6));
	}	
	
	@Test
	void test_printfib6() {
		f.printFib(6);
	}
	
	@Test
	void test_printfib20() {
		f.printFib(20);
	}	
}
