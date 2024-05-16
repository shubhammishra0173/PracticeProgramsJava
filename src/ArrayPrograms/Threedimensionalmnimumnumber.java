package ArrayPrograms;

public class Threedimensionalmnimumnumber {

	 public static void main(String[] args) {
	        int[][][] array = {
	                { {3, 5, 2}, {9, 8, 7}, {4, 1, 6} },
	                { {2, 4, 1}, {7, 6, 3}, {8, 9, 5} },
	                { {6, 8, 4}, {2, 3, 1}, {5, 9, 7} }
	        };

	        int smallestNumber = Integer.MAX_VALUE;

	        for (int[][] subArray2D : array) {
	            for (int[] subArray1D : subArray2D) {
	                for (int num : subArray1D) {
	                    if (num < smallestNumber) {
	                        smallestNumber = num;
	                    }
	                }
	            }
	        }

	        System.out.println("The smallest number in the array is: " + smallestNumber);
	    }
	}
	







