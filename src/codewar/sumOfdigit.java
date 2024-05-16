 // sum of all digit number until it become unit digit
package codewar;

public class sumOfdigit {

	 public static int digitalRoot(int n) {
	        while (n >= 10) {
	            int sum = 0;
	            while (n != 0) {
	                sum += n % 10;
	                n /= 10;
	            }
	            n = sum;
	        }
	        return n;
	    }
	public static void main(String[] args) {

		 int num1 = 16;
	        int num2 = 942;
	        int num3 = 132189;
	        int num4 = 493193;

	        System.out.println(digitalRoot(num1));   // Output: 7
	        System.out.println(digitalRoot(num2));   // Output: 6
	        System.out.println(digitalRoot(num3));

	}

}
