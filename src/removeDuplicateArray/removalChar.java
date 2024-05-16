package removeDuplicateArray;

import java.util.Arrays;

public class removalChar {
static void removeDup(int[]arr)
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
int[]arraywithoutDuplicates = Arrays.copyOf(arr, noofuniqueels);
for(int i =0;i<arraywithoutDuplicates.length;i++)
{
System.out.println(arraywithoutDuplicates[i]);	
}
}

	public static void main(String[] args) {
		
		removeDup(new int [] {12,3,4,3,2,1,2,12,3,4});
	}

}
