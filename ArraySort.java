package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int temp = 0;
		
		System.out.println("Enter the array elements: ");
		
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
