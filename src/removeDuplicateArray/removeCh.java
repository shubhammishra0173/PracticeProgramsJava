package removeDuplicateArray;

import java.util.Arrays;

public class removeCh {

	static void removeChar(int[]arr)
	{
		int noofuniqueel = arr.length;
		for(int i =0;i<noofuniqueel;i++)
		{
			for(int j =i+1;j<noofuniqueel;j++)
			{
				if(arr[i]==arr[j]) {
					arr[j]=arr[noofuniqueel-1];
					j--;
					noofuniqueel--;
				}
			}
		}
		int[]arrwithoutdup = Arrays.copyOf(arr, noofuniqueel);
		for(int i =0;i<arrwithoutdup.length;i++)
		{
			System.out.println(arrwithoutdup[i]);
		}
	}
	
	public static void main(String[] args) {
		
		
		removeChar(new  int[]   {12,3,4,12,3,5,4,6});
	}

}
