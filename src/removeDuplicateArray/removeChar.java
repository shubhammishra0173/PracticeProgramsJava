package removeDuplicateArray;

import java.util.Arrays;

import inheritance.main;

public class removeChar {
static void removeDup(int []arr)
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
int[]arrwithoutDup=Arrays.copyOf(arr,noofuniqueels);
for(int i =0;i<arrwithoutDup.length;i++)
{
System.out.println(arrwithoutDup[i]);	
}
}
public static void main(String[] args) {
	removeDup(new int[] {12,3,4,12,3,5,5,4});
}
}
