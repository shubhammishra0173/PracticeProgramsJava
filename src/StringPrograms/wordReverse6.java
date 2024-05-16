package StringPrograms;

public class wordReverse6 {

	public static void main(String[] args) {
		String str = "this my work";
		String []split = str.split(" ");
		
		String reversesentence = "";
		for(int i =0;i<split.length;i++)
		{
			String reverse = split[i];
			for(int j=reverse.length()-1;j>=0;j--)
			{ String reverseword = "";
				char ch = reverse.charAt(j);
				reverseword = reverseword+ch;
				reversesentence = reversesentence+reverseword;
			}
				
		}
				System.out.println(reversesentence);

	}

}
