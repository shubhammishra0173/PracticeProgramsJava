package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortMapkey {

	
	static Map<String, Integer> map = new HashMap<>();
	public static void sortbyKey()
	{
		TreeMap<String,Integer>sorted = new TreeMap<>();
		sorted.putAll(map);
		for(Map.Entry<String, Integer>entry :sorted.entrySet())
		{
			System.out.println("key "+entry.getKey() +" "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
        sortbyKey();
	}

}
