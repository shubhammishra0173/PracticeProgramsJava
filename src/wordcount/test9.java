package wordcount;

import java.util.HashMap;
import java.util.Map;

public class test9 {

	public static void main(String[] args) {

		String str ="shubham";
		char[]ch =str.toCharArray();
		
		Map<Character,Integer> maps = new HashMap<Character,Integer>();
		for (int i =0;i<str.length();i++)
		{
			if(maps.containsKey(ch[i]))
			{
				int count = maps.get(ch[i]);
				maps.put(ch[i], count+1);
			}
			else
			{
				maps.put(ch[i], 1);
			}
		}
		System.out.println(maps);
	}

}
