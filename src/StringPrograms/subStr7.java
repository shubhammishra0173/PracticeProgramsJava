package StringPrograms;

public class subStr7 {

	static String findRepeatedString(String s)
	{ int Stringcount =0;
		int length =s.length();
		for(int i =1;i<=length/2;i++)
		{
			String substring = s.substring(0, i);
			int count = length/i;
			StringBuilder sb =new StringBuilder();
			for(int j=0;j<count;j++)
			{
				sb.append(substring);
			}
			if(sb.toString().equals(s))
{
				Stringcount++;
				
return substring;	
}
		}
		
		return null;
	}
public static void main(String[] args) {
String result=findRepeatedString("ababab");

if(result!=null)
{
System.out.println("Substring is "+result);	
}
else {
	System.out.println("String is unique");
}
}
}
