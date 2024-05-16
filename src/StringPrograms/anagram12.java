package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class anagram12 {

	public static void main(String[] args) {
	String s1="wretq";
	String s2="qwert";
	boolean status=true;
	if(s1.length()!=s2.length())
	{
		status=false;
	}
	else
	{
		Map<Character,Integer>maps=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++)
		{
			char ch =s1.charAt(i);
			int count=0;
			if(maps.containsKey(ch))
			{
				count =maps.get(ch);
			}
			maps.put(ch, ++count);
			ch=s2.charAt(i);
			count=0;
			if(maps.containsKey(ch))
			{
			count =maps.get(ch);	
			}
			maps.put(ch, --count);
		}
		for(int values:maps.values())
		{
			if(values!=0)
			{
				status=false;
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

}
