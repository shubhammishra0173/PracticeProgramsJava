package Arraystoreduplicateaddinlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arraylist = new ArrayList<String>();
		for(int i=0;i<10;i++)
		{
			arraylist.add(String.valueOf(i));	
		}
		for(int i=0;i<5;i++)
		{
			arraylist.add(String.valueOf(i));	
		}
		System.out.println(arraylist);
		System.out.println("\nFiltered duplicates : " + processlist(arraylist));
	}
public static Set<String> processlist(List<String> listContainingDuplicates)
{
	final Set <String> resultset = new HashSet<String>();
	final Set<String> tempSet = new HashSet<String>();
	for (String yourInt : listContainingDuplicates) {
		if (!tempSet.add(yourInt)) {
			resultset.add(yourInt);
		}
	}
	return resultset;
}
}
