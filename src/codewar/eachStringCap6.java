package codewar;

import StringPrograms.subString3;

public class eachStringCap6 {

	public static void main(String[] args) {
		String s="testing done by us is a great";
		String[]split=s.split(" ");
		String reservekeyword="";
		for(String str : split)
		{
			String firstWord=str.substring(0,1).toUpperCase();
			String lastWord =str.substring(1).toLowerCase();
			reservekeyword=reservekeyword+firstWord+lastWord;
		}
		System.out.println(reservekeyword);
	}

}
