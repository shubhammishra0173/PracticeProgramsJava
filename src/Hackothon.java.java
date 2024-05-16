import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Hackothon {


		public static void main(String[] args) throws IOException {

		Scanner s=new Scanner(System.in);

		Long N=s.nextLong();

		int K=s.nextInt();

		HashSet<Integer> iv=new HashSet<>();

		HashSet<Integer> jv=new HashSet<>();

		long a[]=new long[1];

		a[0]=N*N;

		while(K-- > 0) {

		int i = s.nextInt();

		int j = s.nextInt();

		System.out.print(solve(N, i, j , iv, jv, a) + " ");

		}

		}

		static long solve(long N, int i, int j, HashSet<Integer>ival, HashSet<Integer>jval,long []a){

		if(ival.contains(i) && jval.contains(j))

		{

		return a[0];

		}

		else if(ival.contains(i))

		{

		jval.add(j);

		a[0]=a[0]-(N-ival.size());

		return a[0];

		}

		else if(jval.contains(j))

		{

		ival.add(i);

		a[0]=a[0]-(N-jval.size());

		return a[0];

		}

		else

		{

		a[0]=a[0]-(2*N-1-ival.size()-jval.size());

		ival.add(i);

		jval.add(j);

		return a[0];

		}

		}

		}

		