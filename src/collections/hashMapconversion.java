package collections;

import java.util.HashMap;
import java.util.Map;

import inheritance.main;

public class hashMapconversion {
	public static Map<Integer, String> maps(int[]keys ,String []value )
	{
		Map<Integer,String>maps =new HashMap<Integer,String>();
		int keysize = keys.length;
		int valuesize = value.length;
		for(int i =0;i<keysize;i++)
		{
			maps.put(keys[i], value[i]);
		}
		return maps;
	}
	
public static void main(String[] args) {
	int[]array = {1,2,3,4};
	String []str = {"shubh","test","done","by"};
	System.out.println(maps(array,str));
}
}
