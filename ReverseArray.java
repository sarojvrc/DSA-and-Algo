package practice;

import java.util.Arrays;

public class ReverseArray {
	
	//function
	static void ReverseArray(int arr[]) {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12,4,87,95,87};
		System.out.println("Array is "+Arrays.toString(arr));
		
		//call the method
		
		ReverseArray.ReverseArray(arr);
	}

}
