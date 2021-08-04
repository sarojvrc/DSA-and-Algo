package practice;

import java.util.Arrays;

public class FindMinandMax {
	
	//function
	static void MinMax(int arr[]) {
		int min = arr[0];
		int max = arr[0];
		
		//for min
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The min element in array is "+min);
		
		//for max
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("The max element is "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25,85,1,45,25,98,78,3,5,7,9,5,5,54};
		
		System.out.println("The array is "+Arrays.toString(arr));
		
		//call the method to find min max
		FindMinandMax.MinMax(arr);

	}

}
