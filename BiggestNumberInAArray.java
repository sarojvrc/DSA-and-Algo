package dsa;
import java.util.Arrays;
import java.util.Scanner;

public class BiggestNumberInAArray {
	public static void main(String args[]) {
		//we will take scanner for user input
		Scanner sc = new Scanner(System.in);
		//we will display some  msg for user 
		System.out.println("Enter the array size");
		int size = sc.nextInt(); //this is for taking size
		int arr[] = new int[size];
		int big = 0;//big no initialization
		System.out.println("Enter the array elememts");
		//now we will take array elements from user
		for(int i=0; i<arr.length; i++) {
			//we are assuming i as array index number )
			arr[i] = sc.nextInt(); //user input for array elements
		}
		//now lets see our array
		System.out.println("The array is "+Arrays.toString(arr));
		
		//now we will the biggest number logic
		big = arr[0]; //we are assuming the biggest number from array is arr[0] i.e. first elements from array
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>big) {
				big = arr[i]; //it will compare all elements with big if it is found any big number then it will replace with that number
			}
		}
		
		//now we all set, let's print the output
		System.out.println("The biggest number from ur array is "+big);
		
	}
}
