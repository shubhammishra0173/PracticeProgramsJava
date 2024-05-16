package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class firstRepeatednonRepCha {

	public static void main(String[] args) {
		String s ="shubham";
		char[] ch =s.toCharArray();
		Map<Character,Integer> maps = new HashMap<Character,Integer>();
		for (char c :ch)
		{
			if(maps.containsKey(c))
			{
				maps.put(c, maps.get(c)+1);
			}
			else
			{
				maps.put(c, 1);
			}
		}
		for(char c :ch)
		{
			if(maps.get(c)==1)
			{
				System.out.println("First non repeated char is "+c);
				break;
			}
		}
		for(char c :ch)
		{
			if(maps.get(c)>1)
			{
				System.out.println("First  repeated char is "+c);
				break;
			}
		}

	}

}
