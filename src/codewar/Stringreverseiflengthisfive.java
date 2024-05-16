package codewar;

public class Stringreverseiflengthisfive {

	public static void main(String[] args) {

String str = "shubham mishra is my";
String reverse = "";
String finalString="";


String[]split = str.split(" ");
for(int i =0;i<split.length;i++)
{
String s = split[i];
if(s.length()>4)
{
for(int j =s.length()-1;j>=0;j--)
{
char ch = s.charAt(j);
reverse= reverse +ch;


}
finalString =finalString+reverse+" ";
}
else
{
finalString=finalString+s+" ";	
}
}
System.out.print(finalString+ " ");
	}

}
