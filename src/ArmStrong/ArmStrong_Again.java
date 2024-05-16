package ArmStrong;

public class ArmStrong_Again {
	public static void main(String[] args) {
		int c =0,a,temp,num=153;
		temp=num;
		
		while(num!=0) {
			
			a=num%10;
			c= c+a*a*a;
			num=num/10;
			
		}
		if(c==temp)
		{
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not armstrong");
		}
	}
}
