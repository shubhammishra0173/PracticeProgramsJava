package Duplicatenumber;

public class Duplicatenumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num = {1,3,2,2,4,45,6,3,3,4,1};
for(int i =0;i<num.length;i++) {
	
	for(int j=i+1;j<num.length;j++)
	{
		if(num[i]==num[j])
		{
			System.out.println(num[j]);
		}
	}
}
	}

}
