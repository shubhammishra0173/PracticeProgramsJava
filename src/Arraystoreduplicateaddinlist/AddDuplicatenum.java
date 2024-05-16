package Arraystoreduplicateaddinlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddDuplicatenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();

for(int i =0;i<10;i++)

	{
	list.add(String.valueOf(i));
	}
for (int i =0;i<5;i++)
{
list.add(String.valueOf(i));	
}
System.out.println("List with duplicate value " +list);
System.out.println("List without duplicate " + processlist(list));
}
public static Set<String> processlist(List<String> listcontainingduplicates)
{
final Set<String>  resultset = new HashSet<String>();
final Set<String>  tempset = new HashSet<String>();
for(String urInt : listcontainingduplicates)
{
if(!tempset.add(urInt))
{
resultset.add(urInt)	;
}
}
return resultset;
}
}
