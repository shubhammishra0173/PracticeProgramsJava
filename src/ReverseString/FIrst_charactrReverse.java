package ReverseString;

public class FIrst_charactrReverse {
	public static void main(String[] args) {
		
		 String input = "Ran Vijay";
	        String reversed = reverseStringExceptFirstChar(input);
	        System.out.println(reversed);
	    }

	    public static String reverseStringExceptFirstChar(String input) {
	        if (input == null || input.length() < 2) {
	            return input;
	        }

	        char[] characters = input.toCharArray();

	        for (int i = 1, j = input.length() - 1; i < j; i++, j--) {
	            char temp = characters[i];
	            characters[i] = characters[j];
	            characters[j] = temp;
	        }

	        return new String(characters);
	    }
	}