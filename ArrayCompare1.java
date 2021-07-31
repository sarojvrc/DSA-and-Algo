package dsa;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCompare1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int arr2[] = new int[size];
		
		System.out.println("Enter array elements for Array 1");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the array elements for Array 2");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Array 1 is "+ Arrays.toString(arr));
		System.out.println("Array 2 is "+Arrays.toString(arr2));
		
		//let's compare both arrays
		if(Arrays.equals(arr, arr2)) {
			System.out.println("Both Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
		
	}

}
