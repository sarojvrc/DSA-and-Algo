package linkedlist;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	//method for linearSearch
	static void linearSearch(int arr[], int element) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(element == arr[i]) {
				System.out.println("Element found in "+i+"th position");
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("Element not found");
		}
	}

	//driver code
	public static void main(String args[]) {
		//now let's take an user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		//ask user for search input
		System.out.println("Enter the element to search");
		int element = sc.nextInt();
		//now let's call the method for searching
		linearSearch(arr, element);
	}
}
