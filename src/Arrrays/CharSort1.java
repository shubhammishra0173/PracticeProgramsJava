package Arrrays;

public class CharSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "shubham";
		char[] ch = name.toCharArray();
		char temp= 0;
		for(int i =0;i<name.length();i++)
		{
			for(int j = i+1;j<name.length();j++)
			{
				if(ch[i]>ch[j])
				{
					temp = ch[i];
					ch[i] =ch[j];
					ch[j] = temp;
				}
				
			}
			System.out.println(ch[i]);
			
		}

	}

}
