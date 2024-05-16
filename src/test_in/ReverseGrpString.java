package test_in;

public class ReverseGrpString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am a busy in IV";
		String[] temp = str.split(" ");
		
		String reverse = "";
		for (int i =temp.length-1;i>0;i--)
		{
			reverse= reverse+temp[i];
			
	
		if(i!=0) {
		System.out.println(" "+temp[i] + reverse);
		}
		}
	}
}

