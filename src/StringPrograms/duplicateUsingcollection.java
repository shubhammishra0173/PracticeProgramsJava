package StringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicateUsingcollection {

	public static void main(String[] args) {
		String s = "shubham mishra";
		Map<Character,Integer> maps = new HashMap<Character,Integer>();
		char[]ch =s.toCharArray();
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
		Set<Character>set = maps.keySet();
		for(char c : set)
		{
			if(maps.get(c)>1)
			{
				System.out.println( c +" "+maps.get(c));
			}
		}
		
		
	}

}
