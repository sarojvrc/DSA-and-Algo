package practice;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	//function for linearSearch
	static void linearSearch(int arr[], int element) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				System.out.println("The element is present at "+i+"th positon");
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("The element is not found");
		}
	}

	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		System.out.println("Enter the element to search");
		int element = sc.nextInt();
		
		//call the method for linear search
		linearSearch(arr, element);
	}
}
