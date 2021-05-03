package com.alliconsulting.practice.app;

public class HourGlass2D {

	AsifStrategy as = new AsifStrategy();
	OlegStrategy os;
	
	public int hourglassSum(int[][] arr) {
		return as.hourglassSum(arr);
	}
}

class AsifStrategy{
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

class OlegStrategy {

    public static void test(){
        int[][] source1 = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };
        int[][] source2 = {
                {-9,-9,-9,1,1,1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0,0,8,6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}
        };

        System.out.println("test() sum1 = "+ hourglassMaxSum(source1));
        System.out.println("test() sum2 = "+ hourglassMaxSum(source2));
    }

    public static int hourglassMaxSum(int[][] source){
        int hourglassArrSize = 3;

        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row <= source.length-hourglassArrSize; row++){
            for (int column = 0; column <= source[0].length-hourglassArrSize; column++) {
                int[][] curSource = getHourglassArr(source, row, column, hourglassArrSize);
                int curSum = calculateHourglassSum(curSource);
                if (curSum > maxSum) {
                    maxSum = curSum;
                }
            }
        }
        return maxSum;
    }

    private static int[][] getHourglassArr(int[][] source, int rowStartIndex, int columnStartIndex, int hourglassArrSize){
        int[][] res = new int[hourglassArrSize][hourglassArrSize];
        for (int column = 0; column < res[0].length; column++)
            for (int row = 0; row < res.length; row++)
                res[row][column] = source[rowStartIndex + row][columnStartIndex + column];
        return res;
    }

    private static int calculateHourglassSum(int[][] source){
        int res = 0;
        for (int column = 0; column < source[0].length; column++) {
            for (int row = 0; row < source.length; row++) {
                if (isHourglassElement(column, row, source[0].length, source.length))
                    res += source[row][column];
            }
        }
        return res;
    }

    private static boolean isHourglassElement(int columnIndex, int rowIndex, int hourglassWidth, int hourglassHeight){
        return rowIndex == 0 || rowIndex == hourglassHeight-1
                || (columnIndex != 0 && columnIndex != hourglassWidth-1);
    }
}

