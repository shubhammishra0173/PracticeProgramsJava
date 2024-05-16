
public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "shubham";
		char[]ch=str.toCharArray();
		for(int i =0;i<str.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.println(ch[i]);
			}
		}
	}

}
