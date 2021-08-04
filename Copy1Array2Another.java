package practice;

import java.util.Arrays;

public class Copy1Array2Another {
	
	static void CopyArray(int arr[]) {
		int arr2[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println("Copied array is "+Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {12,54,7,52,52};
		
		System.out.println("1st array is "+Arrays.toString(arr));
		
		//call the method
		Copy1Array2Another.CopyArray(arr);
	}

}
