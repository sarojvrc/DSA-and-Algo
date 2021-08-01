package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayInsertElement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		//we will now take array
		int arr[] = new int[size + 1]; //here size + 1 because we will add a new element in the array
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//we will see our array
		System.out.println("Our array is "+Arrays.toString(arr));
		//now we will take new elements
		System.out.print("Enter the array location you want to insert new element ");
		int loc = sc.nextInt();
		System.out.print("Enter the new element");
		int item = sc.nextInt();
		//now we will add the new element
		for(int i=0; i>loc; i--) {
			arr[i] = arr[i-1];
		}
		arr[loc] = item; //put the new item with index value
		size++; //we are incresing the new size
		System.out.println("New array element "+ item+" inserted");
		System.out.println(Arrays.toString(arr));
	}
}
