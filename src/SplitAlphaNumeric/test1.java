package SplitAlphaNumeric;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "dsgd@#$%1234dsdjh@aaj";
String alphabetic="";
String numeric="";
String isspecial="";

for(int i =0;i<str.length();i++)
{ char ch = str.charAt(i);

if(Character.isDigit(ch))
{
numeric = numeric+ch;	
}
if(Character.isAlphabetic(ch))
{
alphabetic = alphabetic +ch;	
}
else {
	isspecial = isspecial+ch;
}
}
System.out.println(numeric);
System.out.println(alphabetic);
System.out.println(isspecial);
	}

}
