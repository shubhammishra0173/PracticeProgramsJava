package SplitAlphaNumeric;

public class split1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "shu@b#h$1&2*3%mish";
String number = "";
String word = "";
String specialchar="";
for(int i=0;i<str.length();i++)
{
char a = str.charAt(i);
if(Character.isDigit(a))
{
number =a+number;	
}
else if(Character.isAlphabetic(a))
{
	word = word+a;}
else
{
specialchar=specialchar+a;	
}
}
System.out.println(number);
System.out.println(word);
System.out.println(specialchar);
	}

}
