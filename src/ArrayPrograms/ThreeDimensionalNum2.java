package ArrayPrograms;

public class ThreeDimensionalNum2 {

	public static void main(String[] args) {
		int[][][] array = 
			{
					{{3,5,2},{1,4,7},{8,12,9}},
					{{17,12,5},{21,42,71},{82,121,91}},
				    {{31,55,29},{62,45,73},{89,123,90}}
			};
		
				
		int smallestNumber =Integer.MAX_VALUE;
		for(int [][]subArray2D:array) {
			for(int[]subArray1D:subArray2D)
			{
				for(int num:subArray1D)
				{
					if(num<smallestNumber)
					{
					smallestNumber=num;
					}
				}
			}
		}
		System.out.println(smallestNumber);
		
	}

}
