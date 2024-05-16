public class stringcount{
public static void main(String[] args) {
	
		
		String str = "I will eat 2 burgers 23 fries & 1.25 cokes l8r";
		char[] ch=str.toCharArray();
	
		for(int i =0;i<ch.length;i++)
		{
			
			if(ch[i]=='5')
			{
				System.out.println(ch[i]);
				break;
			}
		}
		}
		
		
	}