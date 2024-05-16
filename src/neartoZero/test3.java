package neartoZero;

public class test3 {

	public static void main(String[] args) {
		
		
		int[] arr= {12,3,4,2,1};
		int near = arr[0]*arr[0];
		for(int i =0;i<arr.length;i++)
		{
			int curr = arr[i]*arr[i];
			if(curr<=near)
			{
				near =arr[i];
			}
		}
		System.out.println(near);
	}

}
