package ArrayPrograms;

import java.util.Arrays;

public class bothArrayAreequalOrnot {

	public static void main(String[] args) {
		int[]arr1 = {12,3,4,5,32,6};
		int[]arr2 = {3,4,12,5,6,2};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean result = true;
		if(arr1.length!=arr2.length) {
		result =false;
		}
		else {
		for(int i =0;i<arr1.length;i++)
		{ 
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]!=arr2[j])
				{
				result=false;
				
				}
				else
				{
					result =true;
				}
			}
		}
		}
		
		if(result)
		{
			System.out.println("both arrays are equal");
		}
		else {
			System.out.println("array is not equal");
		}
		
		
	}

}
