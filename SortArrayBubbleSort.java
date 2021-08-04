package practice;

import java.util.Arrays;

public class SortArrayBubbleSort {
	
	//function to sort
	static void BubbleSort(int arr[]) {
		for(int i=0; i<arr.length -1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {45,87,6,87,2,5,65,9,52,4,36,4};
		
		System.out.println("The array is "+Arrays.toString(arr));
		
		//method
		SortArrayBubbleSort.BubbleSort(arr);
		
		System.out.println("After Sorting "+Arrays.toString(arr));

	}

}
