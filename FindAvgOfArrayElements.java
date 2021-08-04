package practice;

import java.util.Arrays;

public class FindAvgOfArrayElements {
	
	//function to find avg
	static void FindAvg(int arr[]) {
		int sum = 0;
		int avg = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum/arr.length;
		System.out.println("The avarage of all elements is "+avg);
	}
	

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,5,5};
		System.out.println("The array is "+Arrays.toString(arr));
		
		//call the method
		FindAvgOfArrayElements.FindAvg(arr);

	}

}
