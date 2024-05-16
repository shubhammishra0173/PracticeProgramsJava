package wordoccurance;

public class removeCharocuurance {
	static final int MAX_CHAR = 26;
	  
	static void removeChars(char arr[], int k)
	{
	    // Hash table initialised to 0
	    int hash[]=new int[MAX_CHAR];
	     
	    for (int i = 0; i <MAX_CHAR; ++i)
	    hash[i]=0;
	  
	    // Increment the frequency of the character
	    int n = (arr).length;
	    for (int i = 0; i < n; ++i)
	        hash[arr[i] - 'a']++;   
	  
	    // Next index in reduced string
	    int index = 0;
	    for (int i = 0; i < n; ++i) {
	  
	        // Append the characters which
	        // appears less than k times
	        if (hash[arr[i] - 'a'] < k) {
	           arr[index++] = arr[i];
	        }
	    }
	    for (int i = index; i < n; ++i)
	    arr[i] = ' ';
	}
	  
	public static void main(String args[])
	{
	    char str[] = "geeksforgeeks".toCharArray();;
	    int k = 2;
	    removeChars(str, k);
	    System.out.println(String.valueOf( str));
	}
	 
	}