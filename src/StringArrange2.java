
public class StringArrange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		preservSpace("aid ni myvol");
	}
	public static void preservSpace(String str)
	{
		int n = str.length();
		int start = 0;
		int end = n-1;
		char[]ch = str.toCharArray();
		while(start <end)
			
		{
			if(ch[start]==' ')
			{
				start++;
				continue;
			}
			if(ch[end]==' ')
			{
				end--;
				continue;
			}
			else
			{
				char temp=ch[start];
				
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(String.valueOf(ch));
	
	}
	
}
