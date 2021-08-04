package practice;

import java.util.Arrays;

public class SelectionSort {
	
	//function
	static void SelectionSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {45,87,2,8,63,5,20,41,4,78,6,24,12,11,36};
		
		System.out.println("The array is "+Arrays.toString(arr));
		
		//method
		SelectionSort.SelectionSort(arr);
		
		System.out.println("After sorting "+Arrays.toString(arr));
	}

}
