package wordcount;

import java.util.HashMap;
import java.util.Map;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "test done test";

String[]split = str.split(" ");
Map<String,Integer> maps= new HashMap<String,Integer>();

for(int i =0;i<split.length;i++)
{
if(maps.containsKey(split[i]))
{
int count = maps.get(split[i]);
maps.put(split[i], count+1);
}
else
{
	maps.put(split[i], 1);
	}
}
		System.out.println(maps);
	}

}
