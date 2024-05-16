package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateChar {

	static void duplicatechar(String str)
	{
		Map<Character, Integer> maps = new HashMap<>();
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(maps.containsKey(ch))
			{
				maps.put(ch, maps.get(ch)+1);
			}
			else
			{
				maps.put(ch, 1);
			}
		}
		Set<Character>set = maps.keySet();
		for(char c :set)
		{
			if(maps.get(c)>1)
			{
				System.out.println(maps.get(c) +" "+c);
			}
		}
	}
	
	public static void main(String[] args) {
		duplicatechar("shubham mishra");
		
	}

}
