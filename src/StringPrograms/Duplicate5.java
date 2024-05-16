package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate5 {

	static void duplicate(String s)
	{
		Map<Character,Integer>maps =new HashMap<>();
		for(int i =0;i<s.length();i++)
		{
			char ch =s.charAt(i);
					{
				if(maps.containsKey(ch))
				{
					maps.put(ch, maps.get(ch)+1);
				}
				else
				{
					maps.put(ch, 1);
				}
					}
			
		}
		Set<Character>set=maps.keySet();
		
		for(char c :set)
		{
			if(maps.get(c)>1)
			{
				System.out.println(maps.get(c)+" "+c);
			}
		}
	}
	
	public static void main(String[] args) {
	
		duplicate("asgahashgahshg");

	}

}
