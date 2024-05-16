package Arrrays;

public class sortString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {12,34,56,87,89};
		int temp;
		for(int i =0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
