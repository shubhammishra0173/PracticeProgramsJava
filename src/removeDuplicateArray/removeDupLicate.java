package removeDuplicateArray;

import java.util.Arrays;

public class removeDupLicate {

	
	static void removeDup(int []arr)
	{
		int noofuniqueels=arr.length;
		for(int i =0;i<noofuniqueels;i++)
		{
			for(int j=i+1;j<noofuniqueels;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[noofuniqueels-1];
							noofuniqueels--;
					j--;
				}
			}
		}
		System.out.println("=======Array without Duplicate======");
	int[]arrwithoutduplicates= Arrays.copyOf(arr,noofuniqueels);
	for(int i =0;i<arrwithoutduplicates.length;i++)
	{
		System.out.print(arrwithoutduplicates[i]+" ");
	}
	
	}
	public static void main(String[] args) {
		removeDup(new int[] {12,3,4,12,3,5,6,4,5});

	}

}
