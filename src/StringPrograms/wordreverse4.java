package StringPrograms;

public class wordreverse4 {

	public static void main(String[] args) {
		String s = "This is my program";
		String [] split = s.split(" ");
		
		String reversesentence = "";
		
		for(int i =0;i<split.length;i++)
		{
			String reverseword ="";
			String word = split[i];
			for(int j =word.length()-1;j>=0;j--)
			{
				
				reverseword= reverseword+word.charAt(j);
			}
			reversesentence= reversesentence+reverseword+ " ";
			System.out.println(reversesentence);
			
		}
		
	}

}
