package Arrrays;

import java.util.HashMap;
import java.util.Map;

public class MergeArray2 {
	static void mergeArray(int a[],int b[], int m ,int n)
	{
	Map<Integer,Boolean> maps =new HashMap<Integer,Boolean>();
	for(int i =0;i<m;i++)
	{
		maps.put(a[i], true);
	}
	for(int i =0;i<n;i++)
	{
		maps.put(b[i], true);
	}
	for(Map.Entry<Integer, Boolean>mp : maps.entrySet())
	{
		System.out.println(mp.getKey());
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,5,7},b[]={2,5,7,9};
int size = a.length;
int size1 = b.length;
mergeArray(a, b, size, size1);
		
	}

}
