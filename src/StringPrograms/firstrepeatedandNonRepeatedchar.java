package StringPrograms;

import java.util.HashMap;

public class firstrepeatedandNonRepeatedchar {
	
	public static void main(String[] args) {
		
		String s = "shubham";
		char[]c = s.toCharArray();
		HashMap<Character,Integer> maps = new HashMap<Character,Integer>();
		for(char ch:c)
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
		for(char ch:c)
		{
			if(maps.get(ch) ==1)
			{
				System.out.println("first non repeated character of string is "+ch);
				break;
			}
			
		}
		for(char ch:c)
		{
			if(maps.get(ch)>1)
				
			{
				System.out.println(" repeated char is "+ch);
				break;
			}
		}
	}

}
