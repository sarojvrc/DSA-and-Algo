package dsa;

//import java.util.Arrays;
//import java.util.Scanner;

public class DuplicateArray {
	public static void main(String args[]) {
		DuplicateArray obj = new DuplicateArray();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of the array");
//		int size = sc.nextInt();
//		int arr[] = new int[size];
//		int n = arr.length;
//		System.out.println("Enter the array elements");
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}	
		int arr[] = {1, 2, 3, 1, 3, 6, 6, 4, 4, 6, 8, 9, 0, 9, 9};
		int n = arr.length;
		obj.Duplicate(arr, n);
		
		//System.out.println("Your input array is "+Arrays.toString(arr));
		
	}
	
	
	void Duplicate(int arr[], int n) {
		//Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			//arr[i]=sc.nextInt();
			int j =Math.abs(arr[i]);
			if(arr[j] >= 0) {
				arr[j] = -arr[j];
			}else {
				System.out.println(j+" ");
			}
		}	
		
	}

}
