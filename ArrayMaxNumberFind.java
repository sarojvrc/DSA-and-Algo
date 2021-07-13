package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxNumberFind {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of tha array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = 0;
		System.out.println("Enter the array elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
