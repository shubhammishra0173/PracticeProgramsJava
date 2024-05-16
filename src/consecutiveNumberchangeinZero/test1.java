package consecutiveNumberchangeinZero;

public class test1 {

	public static void main(String[] args) {
	String s = "43225667544567888";
	char[]ch=s.toCharArray();
	StringBuilder sb =new StringBuilder();
	for(int i =0;i<s.length();i++)
	{
		char currentchar = ch[i];
		char previouschar=ch[i-1];
		if(currentchar==previouschar)
		{
			sb.append('0');
		}
		else
		{
			sb.append(currentchar);
		}
	}
System.out.println(sb.toString());
	}

}
