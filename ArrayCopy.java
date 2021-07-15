package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array 1 size");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		//System.out.println("Enter array 2 size");
		int arr2[] = new int[size1];
		
		System.out.println("Enter array elements");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Array 1 elements "+Arrays.toString(arr1));
		
		for(int i=0; i<arr2.length; i++) {
			
			//arr2[i] = sc.nextInt();
			arr2[i] = arr1[i];
			System.out.println(arr2[i]);
			Arrays.sort(arr2);
			System.out.println(arr2[i]);
		}
		//System.out.println(Arrays.toString(arr2));
	}

}
