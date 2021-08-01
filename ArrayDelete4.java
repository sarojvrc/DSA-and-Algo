package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayDelete4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Our array is "+Arrays.toString(arr));
		//now we will delete using index number
		System.out.println("Enter the index number you want delete");
		int index = sc.nextInt();
		System.out.println(arr[index]+" is deleted");
		for(int i=index; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
		System.out.println("New array is");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
