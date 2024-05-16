package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class mergeunsortedArrayandremoveDuplicates {

private static int [] mergeArrayandRemoveDuplicates(int[]a, int[]b)
{
int[]mergeArray = new int[a.length +b.length];

int i =0,j=0,k=0;

while(i<a.length)
{
	mergeArray[k] = a[i];
k++;
i++;
}
while(j<b.length)
{
mergeArray[k]=b[j];
k++;
j++;

}
Set<Integer>setwithNoduplicates= new HashSet<>();

for(int m = 0 ;m<mergeArray.length;m++)
{
	setwithNoduplicates.add(mergeArray[m]);
}
Iterator<Integer> it = setwithNoduplicates.iterator();
int[]mergewithoutduplicates = new int[setwithNoduplicates.size()];
int n =0;
while(it.hasNext())
{
	mergewithoutduplicates[n] = it.next();
	n++;
}
Arrays.sort(mergewithoutduplicates);
return mergewithoutduplicates;
}
public static void main(String[] args) {
	int[]a = {12,3,4,6,6,7,4,2,5,6,6,7};
	int[]b = {2,5,6,7,8,12,34,45};
	int[]mergeArray = mergeArrayandRemoveDuplicates(a,b);
	 System.out.println("Array A : "+Arrays.toString(a));
     
     System.out.println("Array B : "+Arrays.toString(b));
       
     System.out.println("Sorted Merged Array With No Duplicates : ");
       
     System.out.println(Arrays.toString(mergeArray));
}
}