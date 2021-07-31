package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//to see our array
		System.out.println("Array is "+Arrays.toString(arr));
		System.out.println("Enter the index location to delete the array");
		 int loc = sc.nextInt();
		 
		 for(int i=loc; i<size-1; i++) {
			 arr[i] = arr[i+1];
		 }
		 size--;
//		 for(int i=0; i<arr.length; i++) {
//			
//		 }
		 
		// System.out.println("New array is "+Arrays.toString(arr));
		 for(int i=0; i<size; i++) {
			 System.out.print(arr[i]+" ");
		 }

	}

}
