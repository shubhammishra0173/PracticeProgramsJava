package StringPrograms;

public class reverseWordbyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "this is a way to do coding";
		String [] split = s.split("\\s");
		String reversesentence = "";
		for(int i =split.length-1;i>=0;i--)
		{
			reversesentence= reversesentence +split[i]+" ";
		}
		System.out.println(reversesentence);
	}

}
