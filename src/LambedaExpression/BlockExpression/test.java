package LambedaExpression.BlockExpression;

public class test {

	public static void main(String[] args) {

		functionalInterface f =(n)->{
		int res =1;
		for(int i=1;i<=n;i++)
		
			res = i*res;
			return res;
		
		};
		System.out.println("Factorial of the value "+f.fact(5));
	}
	

}
