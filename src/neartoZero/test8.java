package neartoZero;

public class test8 {

	public static void main(String[] args) {
		int[]data= {4,-1,3,2};
		int near = data[0]*data[0];
		for(int i =0;i<data.length;i++)
		{
			int curr=data[i]*data[i];
			if(curr<=near)
			{
				near=data[i];
			}
		}
		System.out.println(near);

	}

}
