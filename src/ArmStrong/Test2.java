package ArmStrong;

public class Test2 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
int num =153;
int temp =num;
int count=0;
while(num!=0)
	
{
int c = num%10;
count = count +c*c*c;
num = num/10;
}
if(count==temp)
{
	
System.out.println("Armstrong number");}
	}

}
