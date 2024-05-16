package neartoZero;

public class test7 {

	public static void main(String[] args) {
		
		int[]data= {1,-3,4,-5};
		
		int near = data[0];
		int curr=0;
		for(int i =0;i<data.length;i++)
		{
			curr =data[i]*data[i];
			if(curr<=near*near)
			{
				near=data[i];
			}
		}
		System.out.println(near);

	}

}
