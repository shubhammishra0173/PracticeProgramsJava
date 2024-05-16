package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class insogram6 {

	public static void main(String[] args) {
		String s1 = "ertygg";
		
		boolean status =true;
		Map<Character,Integer>maps = new HashMap<>();
		
		 
		for(int i =0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(maps.containsKey(c))
			{
				maps.put(c, maps.get(c)+1);
			}
			else
			{
				maps.put(c, 1);
			}
		
		
		}
		//Set<Map.Entry<Character, Integer>>map = maps.entrySet();
		/*for(Map.Entry<Character, Integer>mp:map)
		{
			if(mp.getValue()>1)
			{
				status =false;
				
			}
		}*/
		Set<Character>set = maps.keySet();
		for(char c :set)
		{
			if(maps.get(c)>1)
			{
				status=false;
			}
		}
		if(status)
	{
			System.out.println("Both the strings are insogram");
	}
		else
		{
			System.out.println("Strings are not insogram");
		}
	}

}
