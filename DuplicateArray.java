package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Your input array is "+Arrays.toString(arr));
	}

}
