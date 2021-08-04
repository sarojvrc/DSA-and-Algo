package practice;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementtoArray {
	
	//function to add the new element
	static int[] Addelement(int arr[], int newele, int size) {
		size = arr.length;
		int newarr[] = new int[size + 1];
		for(int i=0; i<arr.length; i++) {
			newarr[i] = arr[i];
			newarr[size] = newele;
		}
		return newarr;
		
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		System.out.println("Enter the new element you want to add ");
		int newele = sc.nextInt();
		
		//call the function for add
		arr = Addelement(arr, newele, size);
		
		
		System.out.println("Element added "+Arrays.toString(arr));
	}

}
