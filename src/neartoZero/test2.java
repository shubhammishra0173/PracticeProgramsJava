package neartoZero;

public class test2 {

	public static void main(String[] args) {
		
		int[] arr = {2,34,21,23,-1};
		int near =arr[0];
		for(int i =0;i<arr.length;i++)
		{
			int curr = arr[i]*arr[i];
			if(curr<=near*near)
			{
				near =arr[i];
				
			}
		}
		System.out.println(near);
	}

}
