package collections;

import java.util.HashMap;
import java.util.Map;

public class convertArrayHashMap {

	public static Map<Integer,String>convertArrayinMap(int[]key,String[]value)
	{
		Map<Integer ,String> maps=new HashMap<Integer,String>();
		
		int keysize = key.length;
		int valuesize=value.length;
		for(int i =0;i<keysize;i++)
		{
			maps.put(key[i], value[i]);
		}
		return maps;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {12,45,1};
String[]b= {"sasa","sdgfty","8eyu"};
	
System.out.println(convertArrayinMap(a,b));
	}

}
