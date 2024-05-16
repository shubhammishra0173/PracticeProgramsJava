package StringPrograms;

public class subStringCount {

	public static void main(String[] args) {

String s="abcabcabc";
String substring=checkduplicateofsubstring(s);
if(substring!=null)
{
int num=0;
	for(int i =0;i<substring.length();i++)
{
	num++;
}
	
	System.out.println("Total repeated count is "+num);
}
else
{
	System.out.println("String is unique");
}
	}
static String checkduplicateofsubstring(String s)
{
int length=s.length();
for(int i =1;i<=s.length()/2;i++)
{
String substring = s.substring(0, i);
int count =length/i;
StringBuilder sb =new StringBuilder();
for(int j =0;j<count;j++)
{
sb.append(substring);
if(sb.toString().equals(s))
{
return substring;	
}
}

}
return null;
}
}
