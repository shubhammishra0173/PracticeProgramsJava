package StringPrograms;

public class wordReverse8 {

	public static void main(String[] args) {
		String str = "I am bad with my habit";
		String[] split = str.split(" ");
		String reverseSentence = "";
		for(int i =0;i<split.length;i++)
		{
			String word = split[i];
			String reverseword= "";
			for(int j =word.length()-1;j>=0;j--)

			{
			char ch =word.charAt(j);
			reverseword = reverseword+ch;
			}
			reverseSentence = reverseSentence + reverseword+" ";
			
		}
		System.out.print(reverseSentence + " ");

	}

}
