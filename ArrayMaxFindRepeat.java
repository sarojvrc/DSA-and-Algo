package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxFindRepeat {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int max = 0;
		
		int arr[] = new int[size];
		System.out.println("Enter all the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array list is: "+Arrays.toString(arr));
		
		max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("The max number from the array is "+max);
		
	}
}
