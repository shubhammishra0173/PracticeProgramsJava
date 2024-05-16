package Arraystoreduplicateaddinlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i =0;i<10;i++)
		{
			list.add(String.valueOf(i));
		}
		for(int i =0;i<5;i++)
		{
			list.add(String.valueOf(i));
		}
		System.out.println("input list is " +list);
		System.out.println("Filtered List is " +processList(list));

	}
public static Set<String>processList(List<String> listContainingDuplicates)
{
	final Set<String> resultset = new HashSet<String>();
	final Set<String> tempset = new HashSet<String>();
	for(String yourint :listContainingDuplicates )
	{
		if(!tempset.add(yourint))
		{
			resultset.add(yourint);
		}
	}
	return resultset;
}
}
