package com.alliconsulting.practice.app;

public class TurnBook {

	public int pageCount(int n, int p) {
		int pages = Math.min((p/2),(n/2)-(p/2));
		System.out.println( String.format("Number of pages = %d, looking for page %d, half book = %d, page turns=%d", n, p, (n/2), pages));
		return Math.min((p/2),(n/2)-(p/2));
	}

}
