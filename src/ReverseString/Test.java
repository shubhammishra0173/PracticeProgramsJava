package ReverseString;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str = "Shubham Mishra";
 String reverse="";
 char[]ch=str.toCharArray();
 for(int i=str.length()-1;i>=0;i--)
 {
	 reverse = reverse+ch[i];
	 
 }
 System.out.print(reverse);
	}

}
