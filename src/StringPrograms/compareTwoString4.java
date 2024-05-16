package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class compareTwoString4 {

	public static void main(String[] args) {
		String s = "tuverste";
		String s1="vfgtrea";
		char[]ch=s.toCharArray();
		char[]ch1=s1.toCharArray();
		Set<Character>set =new HashSet<>();
		Set<Character>set1 =new HashSet<>();
		for(char c :ch)
		{
			set.add(c);
		}
		for(char c1:ch1)
		{
			set.add(c1);
		}
set1.retainAll(set);
System.out.println(set);
	}

}
