package ArmStrong;

public class ArmStrongNumbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=0,num =163,temp,a;

temp=num;
while(num!=0)
{
a =num%10;
c=c+a*a*a;
num=num/10;
}
if(c==temp)
{
System.out.println(temp +" is armstrong number");	
}
else
{
	System.out.println(temp +" is not armstrong number");
}
	}

}
