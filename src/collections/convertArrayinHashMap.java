package collections;

import java.util.HashMap;
import java.util.Map;

public class convertArrayinHashMap {

	public static Map<Integer,String>maps(int[]key,String[]value)
	{
		Map<Integer,String>maps =new HashMap<>();
		int keysize =key.length;
		int valuesize=value.length;
		for(int i =0;i<key.length;i++)
		{
			maps.put(key[i], value[i]);
		}
		return maps;
	}
	
	public static void main(String[] args) {
		
		int[]key= {12,34,56,54,45};
		String []value= {"cxvxvx","cxvbvcx","fdg","fsd34","test12"};
	System.out.println(maps(key,value));

	}

}
