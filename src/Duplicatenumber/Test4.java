package Duplicatenumber;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = {12,23,45,12,34,23};
		int count =1;
	for(int i =0;i<num.length;i++)
	{ 
		for(int j =i+1;j<num.length;j++)

		{
			if(num[i]==num[j] && num[i]!=0)
			{
				count++;
				num[j]=0;
				break;
			}
		}
		if(count>1&& num[i]!=0)
		{
			System.out.println(num[i]);
		}
	}
	}

}
