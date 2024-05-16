package DuplicateCharacter;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Shubham mishra";
		char[]ch=str.toCharArray();
		int count;
		for(int i =0;i<str.length();i++)
		{
			count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j]&&ch[i]!=' ')
				{
					count++;
					ch[j]=0;
					break;
				}
			}
			if(count>1&&ch[i]!='0')
			{
				System.out.println(ch[i]);
			}
		}
	}

}
