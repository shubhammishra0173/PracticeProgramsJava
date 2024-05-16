package Duplicatenumber;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12,34,56,12,34};
		for(int i =0;i<arr.length;i++)
		{int count =1;
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i] != 0)
				{
					count++;
					arr[j]=0;
					break;
				}
			}
			if(count>1 && arr[i]!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
