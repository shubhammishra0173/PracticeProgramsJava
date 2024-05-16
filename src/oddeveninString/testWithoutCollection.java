 package oddeveninString;

public class testWithoutCollection {
	public static void main(String[] args) {
		
		String str = "12345678912345";
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < str.length(); i++) {
		    char c = str.charAt(i);
		    int num = Character.getNumericValue(c);
		    if (num % 2 == 0) {
		        evenCount++;
		    } else {
		        oddCount++;
		    }
		}

		System.out.println("Even count: " + evenCount);
		System.out.println("Odd count: " + oddCount);
	}

}
