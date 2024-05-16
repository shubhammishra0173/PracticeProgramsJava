package Arrrays;

public class charsort2 {
	public static void main(String[] args) {
		char temp='0';
		String word="shubham";
		char[]ch =word.toCharArray();
		for(int i =0;i<word.length();i++)
		{
			for(int j =i+1;j<word.length();j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			}
			System.out.print(ch[i]);
		}
		
	}

}
