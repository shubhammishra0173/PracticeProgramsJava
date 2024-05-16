 package StringPrograms;

public class wordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is my work";
		String[]split=str.split(" ");
		
		String reverseString="";
		for(int i =0;i<split.length;i++)
		{
			String word =split[i];
			String reverseword = "";
			for(int j =word.length()-1;j>=0;j--)
			{ 
				reverseword= reverseword+word.charAt(j);
			}
			reverseString= reverseString+reverseword+ " ";
		}
		System.out.println(reverseString);
		
	}

}
