package practice;

import java.util.Arrays;

public class DeleteElement {
	
	//function to delete the element
	static void DeleteElement(int arr[], int del) {
		for(int i=0; i<arr.length; i++) {
			if(del == arr[i]) {
				for(int j=i; j<arr.length -1; j++) {
					arr[j] = arr[j+1];
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 54,5, 25,87,58,78,5};
		System.out.println("Array is "+Arrays.toString(arr));
		
		int del = 12;
		
		DeleteElement.DeleteElement(arr, del);
		System.out.println("After deleted "+Arrays.toString(arr));

	}

}
