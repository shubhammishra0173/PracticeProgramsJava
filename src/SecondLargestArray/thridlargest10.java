package SecondLargestArray;

public class thridlargest10 {

	public static void main(String[] args) {
	
		int[]arr= {12,56,87,77,67,45};
		int temp=0;
		int n =arr.length;
		 for(int i =0; i<arr.length;i++) {
			 for(int j =i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 System.out.println(arr[n-3]);

	}

}
