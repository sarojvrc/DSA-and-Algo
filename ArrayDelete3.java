package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayDelete3 {
	static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		//now we will take the array
		int arr[] = new int[size];
		//now we will take the array inputs from the user
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt(); //here we are taking input from user
		}
		//now we can see our array by a predefined method
		System.out.println("The inputted array is "+Arrays.toString(arr));
		
		int index = sc.nextInt(); //we will delete using the index number so we are taking index input from user
		for(int i=index; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		//we will print the new array
		System.out.println("The new array is");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
