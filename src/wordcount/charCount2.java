package wordcount;

import java.util.HashMap;
import java.util.Map;

public class charCount2 {

	public static void main(String[] args) {
		String str = "shubham";
		char [] ch = str.toCharArray();
		Map<Character,Integer>maps = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
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
		System.out.println(maps);

		
	}

}
