package Duplicatenumber;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2,3,4,5,1,2,4,5,6,7,6,8,8};
		for(int i = 0 ;i<arr.length;i++)
		{
			for (int j = i +1 ; j<arr.length;j++)
			{
				if(arr[i] == arr[j]) {
				System.out.println("Duplicate nimber is "+arr[j]);
				}
			}
		}
	}

}
