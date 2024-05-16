
// sort the number in triplate where divisor is by 6 

package divisorArray;

import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
		
		int[] arr = {12, 4, 3, 5, 2, 1, 67, 32, 45, 76, 34, 21};
		boolean status =true;
		
		if(arr.length%6==0)
		{
			 status =true;
		}
		else {
			status =false;
		}
		if(status)
		{
			 int[] sortedArr = new int[arr.length];
			int[] triplet = new int[3];
					
						for(int i =0;i<arr.length;i+=3) {
						
						
						  for (int j = 0; j < triplet.length; j++) {
				                triplet[j] = arr[i + j];
				            }
						
					
					
					Arrays.sort(triplet);
					 for (int j = 0; j < triplet.length; j++) {
			                sortedArr[i + j] = triplet[j];
			            }
					 
						}
						for(int k=0;k<sortedArr.length;k++)
						{
							System.out.println(sortedArr[k]);
						}
		}

	}

}
