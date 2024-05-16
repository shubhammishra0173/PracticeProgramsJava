package removeDuplicateArray;

import java.util.Arrays;

public class duplicateRemoval {
	
	static void arrayRemoval(int []arr)
	{
		int noofuniqueels = arr.length;
		for(int i =0;i<noofuniqueels;i++)
		{
			for(int j =i+1;j<noofuniqueels;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j] = arr[noofuniqueels-1];
					noofuniqueels--;
					j--;
				}
				
			}
		}
		System.out.print("==========");
		int[]arrayWithoutDuplicates = Arrays.copyOf(arr,noofuniqueels);
				for(int i =0;i<arrayWithoutDuplicates.length;i++)
				{
					
					System.out.print(arrayWithoutDuplicates[i] + " ");
				}
	}
	public static void main(String[] args) {
		arrayRemoval(new  int []  {12,3,4,3,1,3,2,12,34,53});	
	}

}
