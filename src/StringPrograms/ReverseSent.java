package StringPrograms;

public class ReverseSent {

	public static void main(String[] args) {
		String str = "I am not done yet";
		String [] split = str.split(" ");
		
		String reverSenetnce = "";
		for(int i =0;i<split.length;i++)
		{
			String word = split[i];
			String reverseWord = "";
			for(int j =word.length()-1;j>=0;j--)
			{
				char c = word.charAt(j);
				reverseWord = reverseWord+c;
			}
			reverSenetnce = reverSenetnce + reverseWord + " ";
		}
		System.out.println(reverSenetnce);
	}

}
