package DuplicateCharacter;

public class duplicateChar {

	public static void main(String[] args) {
		
		int count;
		 String str = "shubham";
		 
		 char[] ch = str.toCharArray();
		 for(int i =0;i<str.length();i++)
		 { count=1;
			 for(int j =i+1;j<str.length();j++)
			 
			 {
				 if(ch[i]==ch[j] && ch[i]!=' ')
				 {
					 count++;
					 ch[j]='0';
				 }
			 }
			 if(count>1 && ch[i]!=' ')
			 {
				 System.out.println(ch[i]);
			 }
			
		 }
		

	}

}
