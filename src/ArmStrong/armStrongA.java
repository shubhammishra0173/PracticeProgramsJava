package ArmStrong;

public class armStrongA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =153, c=0,a,temp;
		temp = num;
while(num!=0)
{
a = num%10;
c =c+a*a*a;
num =num/10;

}
if(c==temp)
{
System.out.println("Number is armstrong");	
}
else
{
System.out.println("Not armstrong");	
}
	}

}
