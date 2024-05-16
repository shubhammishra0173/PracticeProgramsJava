package DuplicateCharacter;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st = "shubhammishra";
char[] ch =st.toCharArray();
int count;
for(int i=0;i<st.length();i++)
{
	count =1;
	for(int j=i+1;j<st.length();j++)
	{
		
		if(ch[i]==ch[j] && ch[i]!=' ')
		{
			count++;
			ch[j]=0;
		}
	}
	if(count>1 && ch[i]!=0)
	{
		
		System.out.println(ch[i]);
	}
}
	}

}
