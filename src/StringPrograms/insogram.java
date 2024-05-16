package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class insogram {

	
	
	
	public static void main(String[] args) {
		String str = "qwertt";
		boolean status = true;
		Map<Character,Integer> maps =new HashMap<>();
		for(int i =0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(maps.containsKey(ch))
			{
				maps.put(ch, maps.get(ch)+1);
			}
			else
			{
				maps.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>>map =maps.entrySet();
		Set<Character>set = maps.keySet();
		/*for(Map.Entry<Character, Integer>mp:map)
		{
			if(mp.getValue()>1)
			{
				status =false;
			}*/
		
		//}
		for(char c :set)
		{
			if(maps.get(c)>1)
			{
				status =false;
			}
		}
		if(status)
		{
			System.out.println("this is insogram");
		}
		else
		{
			System.out.println("This is not insogram");
		}
	}

}
