package removeDuplicateArray;

import java.util.Arrays;

public class removeArray {

	
	static void removeArray(int[]arr)
	{
	int noofuniqueeles= arr.length;
	for(int i =0;i<noofuniqueeles;i++)
	{
		for(int j =i+1;j<noofuniqueeles;j++)
		{
			if(arr[i]==arr[j])
			{
			arr[j]=	arr[noofuniqueeles-1];
				j--;
				noofuniqueeles--;
			}
		}
	}
	int[] withoutdup = Arrays.copyOf(arr,noofuniqueeles);
	for(int i =0;i<withoutdup.length;i++)
	{
		System.out.println(withoutdup[i]);
	}
	}
	public static void main(String[] args) {
		removeArray(new int[] {12,3,4,2,3,4,2,1,1,6});

	}

}
