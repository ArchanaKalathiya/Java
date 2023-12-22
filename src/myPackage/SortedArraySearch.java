package myPackage;
import java.util.*;
public class SortedArraySearch {

	static int binarySearch(int arr[],int x) {
		int low = 0, high = arr.length-1;
		while(low<=high) {
			int mid=low+(high - low)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]<x) {
				low = mid + 1;
			}else {
				high = mid -1;
			}
		}
		return -1;
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
		
		System.out.println("Enter the element to search ->");
		int x=scanner.nextInt();
		
		int result = binarySearch(arr,x);
		if(result == -1) {
			System.out.println("Element "+x+" not present in the array");
		}else {
			System.out.println("Element "+x+" is present at index "+result);
		}
	}

}
