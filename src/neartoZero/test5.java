package neartoZero;

public class test5 {

	public static void main(String[] args) {
		
		int []arr= {2,4,5,23,-1};
		int curr=0;
		int near=arr[0];
		for(int i =0;i<arr.length;i++)
		{
			curr=arr[i]*arr[i];
					if(curr<=near*near)
					{
						near=arr[i];
					}
		}
		System.out.println(near);

	}

}
