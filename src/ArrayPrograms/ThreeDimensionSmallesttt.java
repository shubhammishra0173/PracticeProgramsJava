package ArrayPrograms;

public class ThreeDimensionSmallesttt {

	public static void main(String[] args) {
		int[][][]array = {
				{{12},{37},{18}},
				{{13},{8},{-9}},
				{{15},{39},{21}},
		};
		int value = Integer.MAX_VALUE;
		for(int[][]D2Array:array)
		{
			for(int[]DArray:D2Array)
			{
				for(int num :DArray)
				{
					if(num<value)
					{
						value=num;
					}
				}
			}
		}
		System.out.println(value);
	}

}
