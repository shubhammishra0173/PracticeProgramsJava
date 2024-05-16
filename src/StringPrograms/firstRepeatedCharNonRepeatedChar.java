package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class firstRepeatedCharNonRepeatedChar {

	public static void main(String[] args) {
		
		String str ="shubham";
		Map<Character,Integer>maps =new HashMap<>();
		char[]ch=str.toCharArray();
		for(char c :ch)
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
			if(maps.get(c)>1)
			{
				System.out.println("First Repeated character is "+c);
				break;
			}
		}
		for(char c :ch)
		{
			if(maps.get(c)==1)
			{
				System.out.println("First non Repeated character is "+c);
				break;
			}	
		}
		

	}

}
