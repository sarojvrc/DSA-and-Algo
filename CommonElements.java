package practice;

import java.util.Arrays;

public class CommonElements {
	
	static void CommonElements(int arr1[], int arr2[]) {
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println("Common element found "+arr1[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {12,54,25,87,25,78,25};
		int arr2[] = {12,14,87,885,85, 54};
		
		System.out.println("Array 1 is "+Arrays.toString(arr1));
		System.out.println("Array 2 is "+Arrays.toString(arr2));
		
		//call the method
		
		CommonElements.CommonElements(arr1, arr2);
	}

}
