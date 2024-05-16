package Arrrays;

public class sortString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="shubham";

char[]ch = str.toCharArray();
char temp='0';
for(int i =0;i<ch.length;i++)
{
for(int j =i+1;j<ch.length;j++)
{
if(ch[i]>ch[j])
{
temp = ch[i];
ch[i]=ch[j];
ch[j]=temp;
}
}
System.out.println(ch[i]);
}

	}

}
