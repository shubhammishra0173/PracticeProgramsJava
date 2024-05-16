package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class anagram2 {

	public static void main(String[] args) {
		
		String s1 = "qwesa";
		String s2 = "qwsae";
		boolean status=true;
		if(s1.length()!=s2.length())
		{
			status =false;
		}
		else
		{
			Map<Character,Integer> maps =new HashMap();
			
			for(int i =0;i<s1.length();i++)
			{
				int count =0;
				char ch =s1.charAt(i);
				if(maps.containsKey(ch))
				{
					count =maps.get(ch);
				}
				maps.put(ch, ++count);
				count=0;
				ch=s2.charAt(i);
				if(maps.containsKey(ch))
				{
					count=maps.get(ch);
				}
				maps.put(ch, --count);
			}
			for(int value :maps.values())
			{
				if(value!=0)
				{
					status =false;
				}
					
			}
			
		
		}
		if(status)
		{
			System.out.println("Stings are  anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		
		

	}

}
