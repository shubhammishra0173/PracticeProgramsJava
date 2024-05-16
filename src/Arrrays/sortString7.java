package Arrrays;

import java.util.Scanner;

public class sortString7 {

	public static void main(String[] args) {
		String s;
		Scanner scan =new Scanner(System.in);
		 s =scan.nextLine();
		char[] ch =s.toCharArray();
		char temp=0;
		for(int i =0;i<s.length();i++)
		{
			for(int j =i+1;j<s.length();j++)
			{
				if(ch[j]>ch[i])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					}
			}
			
		}
		System.out.println("Sorted String value is ");
		for(int i =0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}

	}

}
