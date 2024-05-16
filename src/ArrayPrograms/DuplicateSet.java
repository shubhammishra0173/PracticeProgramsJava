package ArrayPrograms;

import java.util.HashSet;

public class DuplicateSet {
	public static void main(String[] args) {
		
		int []array = {12,3,4,5,6,3,3,4,5,6,3};
		
		HashSet<Integer>set = new HashSet<Integer>();
		
		for(int element : array)
		{
			if(!set.add(element))
			{
				System.out.println("Duplicate element is "+element);
			}
		}
		
	}

}
