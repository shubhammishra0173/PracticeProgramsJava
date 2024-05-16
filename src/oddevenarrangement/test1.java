package oddevenarrangement;

public class test1 {
	public static void main(String[] args) {
        int[] numbers = { 9, 4, 7, 2, 5, 8, 1, 6, 3, 10 };
        
        arrangeEvenOdd(numbers);
        
        System.out.println("Array after arranging even and odd numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    
    public static void arrangeEvenOdd(int[] array) {
        int left = 0; // Pointer for even numbers
        int right = array.length - 1; // Pointer for odd numbers
        
        while (left < right) {
            // Find the first odd number from the left
            while (array[left] % 2 == 0 && left < right) {
                left++;
            }
            
            // Find the first even number from the right
            while (array[right] % 2 != 0 && left < right) {
                right--;
            }
            
            // Swap the odd and even numbers
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }
}
