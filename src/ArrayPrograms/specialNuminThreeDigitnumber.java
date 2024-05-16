package ArrayPrograms;

public class specialNuminThreeDigitnumber {
	
	public static void main(String[] args) {
		 int number = 121; // Change this number to test different inputs
	        
	        // Extracting individual digits
	        int firstDigit = number / 100;
	        int middleDigit = (number / 10) % 10;
	        int lastDigit = number % 10;
	        
	        // Checking if it's a special number
	        if (firstDigit == middleDigit && middleDigit == lastDigit) {
	            System.out.println("This is a special number!");
	        } else {
	            System.out.println("This is not a special number.");
	        }
	}

}
