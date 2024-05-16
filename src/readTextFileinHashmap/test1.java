package readTextFileinHashmap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class test1 {

	
	static String filePath = "E:\\photonWorkSpace\\test\\file.txt";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Map<String,String>mapfromfile = HashMapFromTextFile();

for(Map.Entry<String, String> maps : mapfromfile.entrySet())
{
System.out.println(maps.getKey()+" : "+ maps.getValue());	
}
	}
	public static Map<String,String> HashMapFromTextFile() throws IOException
	{
		Map<String, String> map
        = new HashMap<String, String>();
		BufferedReader bf = null;
		File file = new File(filePath);
		bf = new BufferedReader(new FileReader(file));
		String line = null;
		while((line = bf.readLine())!= null)
		{
			String []parts = line.split(":");
			String name = parts[0].trim();
			String number = parts[1].trim();
			
		if(!name.equals("") && !number.equals(""))
		{
			map.put(name, number);
		}
		}
		
		return map;
	}


}
