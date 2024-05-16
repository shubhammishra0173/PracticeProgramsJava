package ArrayPrograms;

public class sumOfIntLeftAndRightisEqual {

	public static int balanceindex(int[]arr)
	{
		int totalsums=0;
		for(int i :arr)
		{
			totalsums+=i;
		}
		int leftsum=0;
		for(int i =0;i<arr.length;i++)
		{
			totalsums-=arr[i];
			if(leftsum==totalsums) {
				return i;
			}
			leftsum+=arr[i];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		 
		  int[] nums1 = {1, 2, 3, 4, 3, 2, 1};
	        int[] nums2 = {1, 100, 50, -51, 1, 1};
	        int[] nums3 = {1, 2, 3, 4, 5};

	        System.out.println(balanceindex(nums1)); // Output: 3
	        System.out.println(balanceindex(nums2)); // Output: 1
	        System.out.println(balanceindex(nums3)); // Output: -1
	}

}
