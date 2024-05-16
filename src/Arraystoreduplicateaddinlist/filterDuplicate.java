package Arraystoreduplicateaddinlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class filterDuplicate {
	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		
		for(int i =0;i<10;i++)
		{
			list.add(String.valueOf(i));
		}
		for(int i =0;i<5;i++)
		{
			list.add(String.valueOf(i));
		}
		System.out.println("input list : "+list);
		System.out.println("input list : "+processlist(list));
	}
	public static Set<String> processlist(List<String>listcontainingDuplicates)
	{
		final Set<String> resultset = new HashSet<String>();
		final Set<String> tempset = new HashSet<String>();
		for(String yourint : listcontainingDuplicates)
		{
			if(!tempset.add(yourint)) {
				resultset.add(yourint);
			}
		}
		return resultset;
	}

}
