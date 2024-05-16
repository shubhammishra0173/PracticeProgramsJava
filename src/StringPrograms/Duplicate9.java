package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate9 {
	
	static void characterDup(String s)
	{
		//char[] ch = s.toCharArray();
		Map<Character,Integer> maps = new HashMap<Character,Integer>();
		
		for(int i =0;i<s.length();i++)
		{ 
			char ch = s.charAt(i);
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
		for(char c: set)
		{
			if(maps.get(c)>1)
			{
				System.out.println("duplicate character is "+c +" and "+"frequency is "+maps.get(c));
			}
			/*else
			{
				System.out.println("No character is duplicate in given String");
			}*/
		}
	}

	public static void main(String[] args) {
		
		characterDup("shubham mishra");
	}

}
