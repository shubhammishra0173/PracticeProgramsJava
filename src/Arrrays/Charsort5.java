package Arrrays;

public class Charsort5 {

	public static void main(String[] args) {
	String str = "shubham";
	char [] ch =str.toCharArray();
	char temp ='0';
	for(int i =0;i<str.length();i++)
	{
		
			for(int j = i+1;j<str.length();j++)
			{
				
			if(ch[i]>ch[j]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
			System.out.println(ch[i]);
	}
		

	}

}
