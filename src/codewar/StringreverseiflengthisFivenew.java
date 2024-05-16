package codewar;

public class StringreverseiflengthisFivenew {

	public static void main(String[] args) {
		String str = "you know nothing except speaking lie";
		String[]split = str.split(" ");
		String reverse = "";
		String finalword = "";
		
		for(int i =0;i<split.length;i++)
		{
			String word = split[i];
			if(word.length()>4)
			{
			for(int j=word.length()-1;j>=0;j--)
			{ char ch = word.charAt(j);
				reverse = reverse +ch;
				
			}
			finalword=finalword+reverse+" ";
			}
			else
			{
			finalword=finalword + word +" ";	
			}
		}
		System.out.println(finalword);

	}

}
