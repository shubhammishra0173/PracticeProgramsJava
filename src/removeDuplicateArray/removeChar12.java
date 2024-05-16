package removeDuplicateArray;

import java.util.Arrays;

public class removeChar12 {

	static void  removeChar(int[]arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		int noofuniqueel = arr.length;
		for(int i =0;i<noofuniqueel;i++)
		{
			for(int j =i+1;j<noofuniqueel;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[noofuniqueel-1];
					noofuniqueel--;
					j--;
				}
			}
			
		}
		int[]arrwithoutDup =Arrays.copyOf(arr,noofuniqueel);
		System.out.println();
		System.out.println("Array without duplicates");
		
		for(int i =0;i<arrwithoutDup.length;i++)
		{
			
			System.out.print(arrwithoutDup[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeChar(new int [] {12,3,4,3,4,3,5,6,7,6,5,4,5});

	}

}
