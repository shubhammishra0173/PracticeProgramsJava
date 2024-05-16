package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class comapreTwoString9 {

	public static void main(String[] args) {
		String s1="sadgfds";
		String s2="dsjawe";
		char[]ch=s1.toCharArray();
		char[]ch1=s2.toCharArray();
		Set<Character>set=new HashSet<>();
		Set<Character>set1=new HashSet<>();
		for(char c :ch)
		{
			set.add(c);
		}
		for(char c1:ch1)
		{
			set1.add(c1);
		}
		set.retainAll(set1);
		System.out.println(set);
		

	}

}
