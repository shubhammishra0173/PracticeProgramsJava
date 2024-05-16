
public class alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="shubham";
		char[]ch =str.toCharArray();
		char ch3 = 0;
		String s = "Axiomxcell";
char ch1;
		for(int i=0;i<=s.length()+1;i+=2) {
			char ch2 =s.charAt(i);
			for(int j =0;j<=i;j++)
			{
				ch3= s.charAt(i++);
		
				System.out.print(ch3);
			//	ch3= s.charAt(index)
		
			}
			
			System.out.println();
		}
	
		

}/*
		String s = "testament";
		char[]ch = s.toCharArray();

		
		for(int i =0;i<s.length();i++)
		
			for(int j =0;j<=i;j++){
		{ boolean res = true;
		if(i%2==0)
		{
		res =false;
		break;
		}
		if(res)
		{
		System.out.println(ch[i]);
		}
		
		}
		
	
			}*/
}