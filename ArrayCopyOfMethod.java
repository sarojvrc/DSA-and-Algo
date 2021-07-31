package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayCopyOfMethod {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//now we will print a msg
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		//now we will take Array1
		int arr1[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		//let's print the array
		System.out.println("The array is "+Arrays.toString(arr1));
		
		int arr2[] = Arrays.copyOf(arr1, size);
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("Second array is "+Arrays.toString(arr2));
	}
	

}
