package Arrrays;

import java.util.HashMap;
import java.util.Map;

public class mergeArray4 {

	public static void main(String[] args) {
	Map<Integer,Boolean>maps= new HashMap<Integer,Boolean>();

	int[]arr1= {12,3,4,5,4};
	int[]arr2= {12,56,7,4,5,78};
	for(int i :arr1)
	{
		maps.put(i, true);
	}
	for(int j:arr2)
	{
		maps.put(j, true);
	}
	for(Map.Entry<Integer, Boolean>map:maps.entrySet())
	{System.out.println(map.getKey());
		
	}
	}

}
