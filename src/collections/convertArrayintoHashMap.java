package collections;

import java.util.HashMap;
import java.util.Map;

public class convertArrayintoHashMap {

	public static Map<Integer,String>maps(int[]keys,String[]value)
	{
		Map<Integer,String>maps = new HashMap<Integer,String>();
		int keysize  = keys.length;
		int valuesize=value.length;
		for(int i =0;i<keys.length;i++)
		{
			maps.put(keys[i], value[i]);
		}
		return maps;
	}
	
	public static void main(String[] args) {
		
int[]arr= {12,4,56,78};
String[]arr1= {"hinjewadi","kohinoor","mishra","shubham"};
System.out.println(maps(arr,arr1));
	}

}
