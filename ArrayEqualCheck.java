package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayEqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("1st array is "+Arrays.toString(arr));
		int arr2[] = new int[size];
		System.out.println("Enter 2nd array elemtns");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("2nd array is "+Arrays.toString(arr2));
		
		//check same or not
		boolean check = Arrays.equals(arr,arr2);
		System.out.println("Both are equal or not "+check);
	}

}
