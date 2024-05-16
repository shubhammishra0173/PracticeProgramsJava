package Arrays;

public class mergeArrayInsortedArrayandremoveDup {

	public static void main(String[] args) {
		int[]a= {12,34,54,11,23,2,45};
		int[]b = {34,78,67,56,98,12,3,45,21};
		int[] mergeArray = new int[a.length+b.length];
		int i =0, j=0 , k=0;
		while(i<a.length)
		{
			mergeArray[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			mergeArray[k]=b[j];
			k++;
			j++;
		}
		for(int m=0;m<mergeArray.length;m++)
		{
			System.out.println(mergeArray[m]);
		}
	}

}
