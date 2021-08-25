package practice;

import java.util.Arrays;

public class ImplementBinarySearch {
	
	//function for binarySearch
	static void binarySearch(int arr[], int element) {
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		int count = 0;
		while(low<=high) {
			if(arr[mid] == element) {
				System.out.println("Element is found at "+mid+"th position");
				count++;
				break;
			}else if(arr[mid] < element) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			mid = (low+high)/2;
		}
		if(count == 0) {
			System.out.println("Element not found");
		}
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10,15,48,98,152,521};
		System.out.println("Array is "+Arrays.toString(arr));
		int element = 9;
		//call the method for BinarSearch
		binarySearch(arr,element);

	}

}
