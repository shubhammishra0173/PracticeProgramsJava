  package codewar;

import inheritance.main;

public class eachStringCapital {
	public static void main(String[] args) {
		
	
	String str = "you are mine";
	String[]split=str.split("\\s");
	String captilizedWords = "";
	for(String w:split)
	{
		String first = w.substring(0, 1);
		String afterFirst = w.substring(1);
		captilizedWords=captilizedWords+ first.toUpperCase()+afterFirst+" ";
	}
	
System.out.println(captilizedWords.trim());
}

}