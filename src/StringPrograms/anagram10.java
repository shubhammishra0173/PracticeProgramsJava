package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class anagram10 {

	public static void main(String[] args) {
		
		String s1 = "wertq";
		String s2 = "qwetr";
boolean status =true;
		if(s1.length()!=s2.length())
		{
			status=false;
			
			
		}
		else
		{
			Map<Character,Integer> maps = new HashMap<>();
			for(int i =0;i<s1.length();i++)
			{
				char ch1= s1.charAt(i);
				int count =0;
				if(maps.containsKey(ch1))
				{
					count = maps.get(ch1);
				}
				maps.put(ch1, ++count);
				ch1= s2.charAt(i);
				count=0;
				if(maps.containsKey(ch1))
				{
					
					count=maps.get(ch1);
				}
				maps.put(ch1, --count);
			}
			for(int values :maps.values())
			{
				if(values!=0)
				{
					status =false;
				}
				
			}
			
		}
		if(status)
		{
			System.out.println("String isangram");
		}
		else
		{
			System.out.println("String is not anagram");
		}
	}

}
