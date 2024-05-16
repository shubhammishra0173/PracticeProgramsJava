package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class mergeTwoArray {

	public static void main(String[] args) {
		int[]a= {12,34,56,1,54};
		int[]b= {78,87,53,21};
		int[]mergearry= new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length)
		{	mergearry[k]=a[i];
		i++;
		k++;
		}
		while(j<b.length)
		{
			mergearry[k]=b[j];
			j++;
			k++;
		}
		for(int m =0;m<mergearry.length;m++)
		{
			System.out.println(mergearry[m]);
		}
		TreeSet<Integer>setwithoutDup = new TreeSet<Integer>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
		for(int n=0;n<mergearry.length;n++)
		{
			setwithoutDup.add(mergearry[n]);
		}
		System.out.println(setwithoutDup);
	}
//	TreeSet<Integer> h =new TreeSet<Integer>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);

}
