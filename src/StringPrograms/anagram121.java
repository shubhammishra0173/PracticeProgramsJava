package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class anagram121 {

	public static void main(String[] args) {
		String s1="wretq";
		String s2="qwert";
		boolean status=true;
		if(s1.length()!=s2.length())
		{
			status =false;
		}else {
		Map<Character,Integer>maps = new HashMap<>();
		
		for(int i =0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			int count =0;
			if(maps.containsKey(c)) {
				count = maps.get(c);
				
			}
			maps.put(c, ++count);
			c= s2.charAt(i);
			count=0;
			if(maps.containsKey(c))
			{
				count=maps.get(c);
			}
			maps.put(c, --count);
		}
		for(int i :maps.values())
		{
		if(i!=0)
		{
			status=false;
		}
		}
		}
		if(status)
		{
			System.out.println("String is anagram");
		}
		else
	
	{
			System.out.println("String is not anagram");
	}
		
	}

}
