package codewar;

public class highestandlowestString2 {

	public static void main(String[] args) {
		
		String str = "1 2 4 6 7";
		String[]split=str.split(" ");
		int lowset = Integer.parseInt(split[0]);
		int highest = Integer.parseInt(split[0]);
		for(int i =0;i<split.length;i++)
		{
		//	char ch = str.charAt(i);
			int num = Integer.parseInt(split[i]);
			if(num<lowset)
			{
				lowset =num;
			}
			if(num>highest)
			{
				highest =num;
			}
		}
		System.out.println(highest +" "+lowset);

	}

}
