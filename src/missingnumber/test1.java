package missingnumber;

import java.util.ArrayList;
import java.util.List;

public class test1 {

	static int getMissingNo(int a[], int n)
	{
	    int n_elements_sum = n * (n + 1) / 2;
	    int sum = 0;
	 
	    for(int i = 0; i < n - 1; i++)
	        sum += a[i];
	         int num = n_elements_sum - sum;
	         
	    return num;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int a[] = { 1, 2, 3,5, 6,7};
	    int n = a.length + 1;
	    int miss = getMissingNo(a, n);
	     
	    System.out.print(miss);
	}
	}
	 