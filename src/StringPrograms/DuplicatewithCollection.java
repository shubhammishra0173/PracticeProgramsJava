package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatewithCollection {

	public static void main(String[] args) {

		String s = "Shubham";
		Map<Character,Integer>maps = new HashMap<>();
		char[] ch =s.toCharArray();
		for(int i =0;i<s.length();i++)
		{
			
			if(maps.containsKey(ch[i]))
			{
				maps.put(ch[i], maps.get(ch[i])+1);
			}
			else {
			maps.put(ch[i], 1);
			}
		}
		
		Set<Character> set = maps.keySet();
		
		for(char c : set)
		{
			if(maps.get(c)>1)
			{
				System.out.println(c +" "+maps.get(c));
			}
		}
	}
	

}
