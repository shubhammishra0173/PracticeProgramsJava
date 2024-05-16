package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class frequency_check {
	
	
	static void frequecnycheck(String s)
	{
		char[]ch =s.toCharArray();
		Map<Character,Integer>maps =new HashMap<Character,Integer>();
		
		for(int i =0;i<s.length();i++)
		{
			if(maps.containsKey(ch[i]))
			{
				maps.put(ch[i], maps.get(ch[i])+1);
			}
			else
			{
				maps.put(ch[i],1);
			}
		}
		Set<Map.Entry<Character, Integer>>map =maps.entrySet();
		int frequency=1;
		char c = 0;
		for(Map.Entry<Character, Integer>m:map)
		{
			if(m.getValue()>frequency)
			{
				frequency=m.getValue();
				c=m.getKey();
			}
					}
		System.out.println(frequency +" "+c);
		
	}
	public static void main(String[] args) {
		frequecnycheck("shubhamsh");
	}

}
