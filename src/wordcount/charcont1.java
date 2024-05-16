package wordcount;

import java.util.HashMap;
import java.util.Map;

public class charcont1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Shubham Mishra";
		String[] split =str.split("");
		char[]ch = str.toCharArray();
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i =0;i<str.length();i++)
		{
			if(map.containsKey(split[i]))
			{
				int count = map.get(split[i]);
				map.put(split[i],count+1);
			}
			else
			{
				map.put(split[i], 1);
			}
		}
		System.out.println(map);

	}

}
