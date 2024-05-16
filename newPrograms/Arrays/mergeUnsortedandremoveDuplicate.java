package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class mergeUnsortedandremoveDuplicate {

	static  int[]  mergeArrayandgiveDuplicate(int[]m , int[]n)

	{
		int[]mergeArray = new int[m.length +n.length];
		
		int i =0,j=0,k=0;
		while(i<m.length)
		{
			mergeArray[k] = m[i];
			k++;i++;
		}
		while(j<n.length)
		{
			mergeArray[k]=n[j];
			k++;
			j++;
			
		}
		Set<Integer>setwithNoduplicates = new HashSet<>();
		for(int a =0;a<mergeArray.length;a++)
		{
			setwithNoduplicates.add(mergeArray[a]);
		}
		Iterator<Integer> it = setwithNoduplicates.iterator();
		int[]mergeWithoutDup = new int[setwithNoduplicates.size()];
		int b =0;
		while(it.hasNext())
			
		{
			mergeWithoutDup[b]=it.next();
			b++;
		}
		Arrays.sort(mergeWithoutDup);
		return mergeWithoutDup;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {12,3,4,6,6,7,4,2,5,6,6,7};
		int[]b = {2,5,6,7,8,12,34,45};
		int[]mergeArray = mergeArrayandgiveDuplicate(a,b);
		 System.out.println("Array A : "+Arrays.toString(a));
	     
	     System.out.println("Array B : "+Arrays.toString(b));
	       
	     System.out.println("Sorted Merged Array With No Duplicates : ");
	       
	     System.out.println(Arrays.toString(mergeArray));
	}

}
