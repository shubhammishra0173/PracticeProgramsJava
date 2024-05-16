package divisorArray;

import java.util.Arrays;

public class test1 {

	 public static void main(String[] args) {
	        int[] arr = {12, 4, 3, 5, 2, 1, 67, 32, 45, 76, 34, 21};
	        int[] sortedArray = sortTripletForm(arr);
	        
	        for (int num : sortedArray) {
	            System.out.print(num + " ");
	        }
	    }

	    public static int[] sortTripletForm(int[] arr) {
	        int n = arr.length;
	        int[] sortedArr = new int[n];
	        
	        for (int i = 0; i < n; i += 3) {
	            int tripletLength = Math.min(3, n - i);
	           
	            int[] triplet = new int[tripletLength];
	            
	            for (int j = 0; j < tripletLength; j++) {
	                triplet[j] = arr[i + j];
	                
	            }
	           
	            Arrays.sort(triplet);
	          
	            
	            for (int j = 0; j < tripletLength; j++) {
	                sortedArr[i + j] = triplet[j];
	            }
	        }
	        
	        return sortedArr;
	    }
	}