package codewar;

public class highestandLowestFromString3 {

	public static void main(String[] args) {
		
		String str = "1 2 3 4 5 6 7";
		String []split = str.split(" ");
		int lowest = Integer.parseInt(split[0]);
		int highest = Integer.parseInt(split[0]);
		for(int i =0;i<split.length;i++)
		{
			int num = Integer.parseInt(split[i]);
			 
			if(num<lowest)
			{
				lowest =num;
			}
			if(num>highest)
			{
				highest=num;
			}
		}
		System.out.println(lowest +" "+highest);
	}

}
