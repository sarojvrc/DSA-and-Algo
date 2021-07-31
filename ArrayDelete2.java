package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayDelete2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		//take the array
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//we will see our array
		System.out.println("The inputted array is "+Arrays.toString(arr));
		
		//show the index msg
		System.out.println("Enter the index no of array which you want to delete");
		int delLocation = sc.nextInt(); //here we are taking the index number of which we want to delete
		
		for(int i=delLocation; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		
		size--;
		
		//now we will see the new array
		//System.out.println("The new array is "+Arrays.toString(arr));
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
