package DuplicateCharacter;

public class dupliChar {

	
	
	public static void main(String[] args) {
		int count;
		String str ="shubham mishra";
		char[]ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{  count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					ch[j]=' ';
				}
			}
			if(count>1 && ch[i]!=' ')
			{
				System.out.println(ch[i]);
			}
			
		}
	}

}
