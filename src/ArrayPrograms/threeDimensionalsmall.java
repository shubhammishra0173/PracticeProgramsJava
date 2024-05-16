package ArrayPrograms;

public class threeDimensionalsmall {

	public static void main(String[] args) {
		int[][][] array = 
			{
					{{3,5,2},{1,4,7},{8,12,9}},
					{{17,12,5},{21,42,71},{82,121,91}},
				    {{31,55,29},{62,45,73},{89,123,90}}
			};
		int smallestnum=Integer.MAX_VALUE;
		for(int[][] i :array)
		{
			for(int[]j : i)
			{
				for(int k:j)
				{
					if(k<smallestnum)
					{
						smallestnum=k;
					}
				}
			}
		}
		System.out.println(smallestnum);

	}

}
