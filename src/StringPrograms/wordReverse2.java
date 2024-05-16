package StringPrograms;

public class wordReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "this is my work";
		String []split = str.split(" ");
	
		String reversestring ="";
		for(int i =0;i<split.length;i++)
		{
			String word = split[i];
			String reverseword = "";
			for(int j = word.length()-1;j>=0;j--)
			{
				reverseword = reverseword+word.charAt(j);
				
			}
			reversestring = (reverseword+reversestring +"  ");
			
		}
		System.out.println(reversestring);
		
	}

}
