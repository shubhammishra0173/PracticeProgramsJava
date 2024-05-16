 package StringPrograms;

import java.util.HashMap;

public class charOccurance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "shubham";
		char[]ch = s1.toCharArray();
		HashMap<Character , Integer>maps = new HashMap<Character,Integer>();
		
		for(char c :ch)
		{
			if(maps.containsKey(c))
			{
				maps.put(c,maps.get(c)+1);
			}
			else
			{
				maps.put(c, 1);
			}
		}
		System.out.println(maps);
	}

}
