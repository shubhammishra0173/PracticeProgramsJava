package SplitAlphaNumeric;

import java.util.*;
import java.io.*;

public class list
{
public static ArrayList<Integer> processArray(ArrayList<Integer> array) {
ArrayList<Integer> result= array;
for (int i = 0; i < array.size(); i++) {
for (int j = 1; j < array.size(); j++) {
if ((result.get(i) > 100) && (result.get(i+1) > 100)) {
result.remove(i+1);
}
}}
return result;
}

public static void main(String[] args) {
ArrayList<Integer> arrayList = new ArrayList<Integer>();
Scanner in = new Scanner(System.in);
while (in.hasNextInt()) {
int num = in.nextInt();
if (num < 0)
break;
arrayList.add(new Integer(num));
}

arrayList = processArray(arrayList);
for(int i=0;i<arrayList.size();i++) {
System.out.println(arrayList.get(i));
}

}
}
