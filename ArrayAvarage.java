package dsa;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAvarage {
	public static void main(String args[]) {
		//we will take scanner class for taking user input
		Scanner sc = new Scanner(System.in);
		//we will print a message so that user can know
		System.out.println("Enter the size of the array");
		// int size is the size of the array
		int size = sc.nextInt();
		int sum = 0;
		double avg = 0;
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		//here we are taking this for array lists
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//our array list
		System.out.println("Your inputted array is "+Arrays.toString(arr));
		
		//for adding the array elements
		for(int i=0; i<arr.length; i++) {
			sum = arr[i] + sum;
		}
		
		//for avarage
		avg = sum/size;
		
		//now we are print our results
		System.out.println("The sum of the total array elements is "+sum);
		System.out.println("The avarage of the array elements is "+avg);
	}
}
