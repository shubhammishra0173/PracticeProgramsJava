package StringPrograms;

public class replaceZero {
	
	 
 public static void removeLeadingZeros(String str)
	    {
	 
	        // Regex to remove leading
	        // zeros from a string
	        String regex = "^0+(?!$)";     
	 
	        // Replaces the matched
	        // value with given string
	        str = str.replaceAll(regex, "");
	 
	        System.out.println(str);
	    }
	 
	    // Driver Code
	    public static void main(String args[])
	    {
	        String str = "00012340000";
	 
	        removeLeadingZeros(str);
	    }
	}