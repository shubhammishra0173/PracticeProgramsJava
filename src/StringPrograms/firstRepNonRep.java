package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class firstRepNonRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "shubham";
		char [] c = s.toCharArray();
		Map<Character,Integer> maps = new HashMap<Character,Integer>();
		for(char ch :c)
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
		for(char ch :c)
		{
			if(maps.get(ch)>1)
			{
				System.out.println(ch);
				break;
			}
		}
		for(char ch :c)
		{
			if(maps.get(ch)==1)
			{
				System.out.println(ch);
				break;
			}
		}

	}

}
