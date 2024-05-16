package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class dup3 {

	static void duplicate(String s)

	{
		char[]ch=s.toCharArray();
		Map<Character,Integer> maps =new HashMap<>();
		for(int i =0;i<s.length();i++)
		{
			if(maps.containsKey(ch[i]))
			{
				maps.put(ch[i], maps.get(ch[i])+1);
			}
			else
			{
				maps.put(ch[i], 1);
			}
		}
		Set<Character>set =maps.keySet();
		for(char c :set)
		{
			if(maps.get(c)>1)
			{
				System.out.println("Duplicate character of string is "+c +" and the freequency of this character is "+maps.get(c));
			}
		}
	}
	public static void main(String[] args) {
		
		duplicate("shubhbas");
	}

}
