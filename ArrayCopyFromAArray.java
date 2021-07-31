package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayCopyFromAArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array siz");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		System.out.println("Enter the 1st Array elements");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i]; //we copied from arr1 to arr2
		}
		
		//now print the arrays
		System.out.println("1st Array is "+Arrays.toString(arr1));
		System.out.println("2nd Array is which is copied from arr1 "+Arrays.toString(arr2));
	
	}
}
