package com.alliconsulting.practice.app;

public class CloudJumper {

	public int jumpingOnClouds(int[] clouds) {
		int jumps=0;
		if(clouds.length<2 || clouds.length>100)
			return jumps;
		if(clouds[0]!=0 && clouds[clouds.length-1]!=0)
			return jumps;
		int i=0;
		while(i<clouds.length) {
			if(i<clouds.length-2 && clouds[i+2]==0) {
				i+=2;
				jumps++;
			}
			if(i<clouds.length-2 && clouds[i+1]==0 && clouds[i+2]==1) {
				i++;
				jumps++;
			}
			if(i==clouds.length-2 && clouds[i+1]==0) {
				i++;
				jumps++;
			}
			if(i>=clouds.length-1) break;
		}
		return jumps;
	}
	
}
