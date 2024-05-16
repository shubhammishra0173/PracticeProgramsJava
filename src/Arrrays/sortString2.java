package Arrrays;

public class sortString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "shubham";
		char temp;
		char[]ch =str.toCharArray();
		for(int i =0;i<str.length();i++)
		{
			for(int j =i+1;j<str.length();j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		System.out.println(ch[i]);
		}
	}

}
