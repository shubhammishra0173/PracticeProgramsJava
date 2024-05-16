package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class compareTwoString5 {

	public static void main(String[] args) {
		String s1 ="shuahw";
		String s2="huaqwe";
		char[]ch = s1.toCharArray();
		char[]ch1=s2.toCharArray();
		Set<Character>set =new HashSet<>();
		Set<Character>set1 =new HashSet<>();
for(char c : ch)
{
set.add(c);	
}
for(char c :ch1)
{
set.add(c);	
}
		set1.retainAll(set);
		System.out.println(set);
	}

}
