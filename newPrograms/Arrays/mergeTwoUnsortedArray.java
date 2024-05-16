package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class mergeTwoUnsortedArray {

	static int[] mergeArrayDup(int[]a,int []b)
	{
		int[]mergeArray = new int[a.length+b.length];
		int k=0,i=0,j=0;
		while(k<a.length)
		{
			mergeArray[k]=a[i];
			i++;
			k++;
			
		}
		while(k<b.length)
		{
			mergeArray[k]=b[j];
			j++;
			k++;
			
		}
		Set<Integer>setwithoutDup = new HashSet();
		for(int m=0;i<mergeArray.length;i++) {
			setwithoutDup.add(mergeArray[m]);
		}
		Iterator<Integer> itr =setwithoutDup.iterator();
		int[]arraywithoutdup=new int[setwithoutDup.size()];
		int c=0;
		while(itr.hasNext())
		{
			arraywithoutdup[c]=itr.next();
			c++;
		}
		return arraywithoutdup;
	}
	
	
	public static void main(String[] args) {
		int[]a= {12,3,412,4,5,6};
		int[]b= {12,4,78,5,4};
		mergeArrayDup(a,b);
	}

}
