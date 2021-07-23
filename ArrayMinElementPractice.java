package dsa;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinElementPractice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size =  sc.nextInt();
		int arr[] = new int[size];
		int min = 0;
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Your array is "+ Arrays.toString(arr));
		min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		//System.out.println("The minimun element in the array is "+min);
		System.out.println("The minimun element in the array is "+min);
		
	}

}
