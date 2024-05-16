package Arrrays;

import java.util.HashMap;
import java.util.Map;

public class mergeArray5 {

	static void mergeArray(int[]arr1, int[]arr2 ,int m ,int n )
	{

		
Map<Integer,Boolean>maps =new HashMap<>();

	
	
	for(int i :arr1)
	{
		
		
			maps.put(i, true);
		
	}
	for(int j :arr2)
	{
		
			maps.put(j, true);
		 
	}
	for(Map.Entry<Integer, Boolean>mp:maps.entrySet())
	{
		System.out.println(mp.getKey());
	}
	
	
	}
	
	public static void main(String[] args) {
	int[]arr1= {12,3,4,14,5,6};
	int []arr2= {45,6,89,67};
	int a=arr1.length;
	int b= arr2.length;
	mergeArray(arr1,arr2,a,b);
}
}