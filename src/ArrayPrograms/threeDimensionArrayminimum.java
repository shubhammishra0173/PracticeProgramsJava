package ArrayPrograms;

public class threeDimensionArrayminimum {

	public static void main(String[] args) {
		int [] [][]arr ={{{8,56,78},{67,75,43},{34,45,89}},
				         {{81,526,718},{617,735,434},{342,456,1089}},
				         {{869,560,781},{697,765,435},{349,458,890}},
		
		};
		int smallestnumber = Integer.MAX_VALUE;
		
		for(int[][] arr1:arr)
		{
			for(int[]arr2:arr1)
			{
				for(int num :arr2)
				{
					if(num<smallestnumber)
						smallestnumber=num;
				}
			}
		}
		System.out.println(smallestnumber);

	}

}
