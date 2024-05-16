package removeZero;

public class seperateOddeven {

	public static void main(String[] args) {
	    int[] numbers = { 9, 4, 7, 2, 5, 8, 1, 6, 3, 10 };
        
        arrangeEvenOdd(numbers);
        
        System.out.println("Array after arranging even and odd numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

	}
	public static void arrangeEvenOdd(int[]array)
	{
		int left=0;
		int right =array.length-1;
		while(left<right)
		{
			while(array[left]%2==0 && left<right)
			{
				left++;
			}
			while(array[right]%2!=0 && left<right)
			{
				right--;
			}
			if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
		}
	}

}
