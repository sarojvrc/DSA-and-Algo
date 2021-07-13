package dsa;

import java.util.Scanner;

public class ArrayBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size = sc.nextInt();
		int max = 0;
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0; i< arr.length; i++) {	
			arr[i]=sc.nextInt();
			//System.out.print("Array Elements");
		}
		max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<max) {
				max = arr[i];
			}
		}
		System.out.println("Min number in the array is: "+max);
		//System.out.println(max);

	}

}
