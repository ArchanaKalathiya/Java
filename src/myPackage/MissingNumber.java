package myPackage;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
	
	static int missingNumber(int[] nums) {
		Arrays.sort(nums);
	
		for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != i) {
	                return i;
	            }
		}
		return nums.length;
}
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the size of the array -> ");
			int size=scanner.nextInt();
			
			int arr[]=new int[size];
			
			System.out.println("Enter the elements of the array ->");
			for(int i=0;i<size;i++) {
				arr[i]=scanner.nextInt();
			}
			
			int result = missingNumber(arr);
			System.out.println("Missing number in the array is "+result);	
	}

}
