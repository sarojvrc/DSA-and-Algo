package practice;

import java.util.Arrays;

public class AddArrayElements {
	
	//function to add elements
	static void AddElement(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of all elements is "+sum);
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,1};
		System.out.println("Array is "+Arrays.toString(arr));
		
		//call the add function
		AddArrayElements.AddElement(arr);

	}

}
