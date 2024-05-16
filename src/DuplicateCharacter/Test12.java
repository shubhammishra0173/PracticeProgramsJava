package DuplicateCharacter;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "shubhammishra";
char[]ch=str.toCharArray();
int count=0;
for(int i=0;i<str.length();i++)
{
for(int j =i+1;j<str.length();j++)
{count=1;
if(ch[i]==ch[j] && ch[i]!=' ')	
{
count++;
ch[j]='0';
break;
}
}
if(count>1 && ch[i]!='0')
{
System.out.println(ch[i]);	
}
}
	}

}
