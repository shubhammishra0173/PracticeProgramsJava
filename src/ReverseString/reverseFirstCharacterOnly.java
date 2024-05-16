package ReverseString;

public class reverseFirstCharacterOnly {
//Ran vijay yan vijaR
	
	
	public static void main(String[] args) {
		
		String s ="Shubham Mishra";
	
	String first = s.substring(0,1);
	String last = s.substring(s.length()-1,s.length());
	
	StringBuilder sb =new StringBuilder();
	String[]split= s.split(" ");
	sb.append(last);
	for(int i=0;i<s.length();i++)
	{
		char []ch =s.toCharArray();
		if(i==s.length()-1)
		{
			System.out.println(s.charAt(i));

		String s1
		=s.replaceAll(Character.toString(s.charAt(i)), first);
		sb.append(s1);	
		//sb.append(first);
			break;
		}
		if(i+1==s.length())
		{
			break;
		}
		sb.append(ch[i+1]);
		
		
		
	}
	System.out.println(sb.toString());
	 
}
}
