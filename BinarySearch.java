package linkedlist;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	//function for binarySearch
	static void binarySearch(int arr[], int element) {
		//for binary search we need min and max index, then mid value
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		int count = 0; //for not found
		
		//lets do the binary search
		while(low<=high) {
			if(arr[mid] == element) {
				System.out.println("Element is found at "+mid+"th positon");
				count++;
				break;
			}else if(arr[mid] < element) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			mid = (low+high)/2;
		}
		
		if(count == 0) {
			System.out.println("Element not found");
		}
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements in a sorted format");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(arr));
		
		//now lets find the binary search
		System.out.println("Enter the element to search");
		int element = sc.nextInt();
		//call the method for search
		binarySearch(arr, element);
	}

}
