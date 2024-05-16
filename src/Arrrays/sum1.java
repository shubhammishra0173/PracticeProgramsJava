package Arrrays;

public class sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int []arr= {23,12,34,56,78};
		for(int i =0;i<arr.length;i++)
		{
			sum =sum +arr[i];
		}
		System.out.println(sum/arr.length);
	}

}
