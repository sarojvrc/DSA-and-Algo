package practice;

import java.util.Arrays;

public class AddTwoArrays {
	
	//function
	static void AddTwoArrays(int arr1[], int arr2[]) {
		int newarr[] = new int[arr1.length + arr2.length];
		for(int i=0; i<arr1.length; i++) {
			newarr[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			newarr[arr1.length + i] = arr2[i];
		}
		
		System.out.println("new added array is "+Arrays.toString(newarr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {45,52,45};
		int arr2[] = {55, 87, 20};
		
		System.out.println("Array1 is "+Arrays.toString(arr1));
		System.out.println("Array2 is "+Arrays.toString(arr2));

		//call the add method
		AddTwoArrays.AddTwoArrays(arr1,arr2);
	}

}
