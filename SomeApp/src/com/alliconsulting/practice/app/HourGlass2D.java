package com.alliconsulting.practice.app;

public class HourGlass2D {

	public int hourglassSum(int[][] arr) {
		int[] hourGlassSums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int s = 0;
		for(int y=0;y<4;y++) {
			for(int x=0;x<4;x++) {
				hourGlassSums[s]=findHourGlassSumAtVertex(x,y,arr);
				s++;
			}
		}		
		return getMaxNumber(hourGlassSums);
	}

	public int getMaxNumber(int[] someArray) {
		int max = -1000;
		for (int i=0;i<someArray.length; i++) {
			if (someArray[i] > max) {
				max = someArray[i];
			}
		}
		return max;
	}

	public int findHourGlassSumAtVertex(int x, int y, int[][] inputArray) {
		int sum = 0;
		for (int j = y; j < (y + 3); j++) {
			for (int i = x; i < (x + 3); i++) {
				sum += inputArray[j][i];
			}
		}
		sum -= inputArray[y + 1][x];
		sum -= inputArray[y + 1][x + 2];
		return sum;
	}
}
