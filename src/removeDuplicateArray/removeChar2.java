package removeDuplicateArray;

import java.util.Arrays;

public class removeChar2 {

	static void removeChar(int[]arr)
	{
		int noofuniqueels=arr.length;
		for(int i =0;i<noofuniqueels;i++)
		{
			for(int j =i+1;j<noofuniqueels;j++)
			{
				if(arr[i]==arr[j])
			{
					arr[j]=arr[noofuniqueels-1];
					j--;
					noofuniqueels--;
			}
			}
		}
		System.out.println("================");
System.out.println("Array without duplicate");
int []arrwithoutdup= Arrays.copyOf(arr, noofuniqueels);

for (int i=0;i<arrwithoutdup.length;i++)
{
	System.out.println(arrwithoutdup[i]);
	}
	}
	
	public static void main(String[] args) {
	
		removeChar(new int [] {12,34,5,4,34,2,3,2,4});
	}

}
