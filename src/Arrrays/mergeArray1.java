package Arrrays;

import java.util.HashMap;
import java.util.Map;

public class mergeArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr = {12,3,4,5,4,123,45};
int []arr1= {15,45,34,67,89};

Map<Integer,Boolean> maps = new HashMap<Integer,Boolean>();
for(int i =0;i<arr.length;i++)
{
	
maps.put(arr[i], true);	
}
for(int j=0;j<arr1.length;j++)
{
maps.put(arr1[j], true);	
}
for(Map.Entry<Integer, Boolean>map:maps.entrySet())
{
System.out.println(map.getKey());	
}

	}

}
