package dsa;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int temp = 0;
		System.out.println("Enter elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print( arr[i]+ " ");
		}
	}
}
