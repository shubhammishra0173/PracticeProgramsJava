package removeDuplicateArray;

import java.util.Arrays;

public class removeChar1 {

	static void removeDuplicate(int[]arr)
	{
		int noofuniquel = arr.length;
		for(int i =0;i<noofuniquel;i++)
		{
			for(int j =i+1;j<noofuniquel;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[noofuniquel-1];
					j--;
					noofuniquel--;
				}
			}
			
		}
		int[]arrwithoutdup = Arrays.copyOf(arr,noofuniquel);
		
		for(int j =0;j<arrwithoutdup.length;j++)
		{
			
			System.out.println(arr[j]);
		}
	}
	
	
	public static void main(String[] args) {
		
		
int[]arr = {1,2,3,1,2,4,4,5,4,5,6,7,1};

removeDuplicate(arr);
	}

}
