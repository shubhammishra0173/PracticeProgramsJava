package wordcount;

import java.util.HashMap;

public class CharCount {
	public static void main(String[] args) {
		String str = "Shubham";
		//String[] split = str.split("");
		
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i =0;i<str.length();i++)
		{
			if(map.containsKey(ch[i]))
			{
				int count = map.get(ch[i]);
				map.put(ch[i], count+1);
			}
			else
			{
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
		
	}
}
