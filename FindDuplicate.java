package practice;

import java.util.Arrays;

public class FindDuplicate {
	
	//function to find duplicate
	static void FindDuplicate(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate found "+arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {54,85,45,78,54,87,88,22,55,12,4,3,5,8,5,87,6,5};
		System.out.println("Array is "+Arrays.toString(arr));
		
		FindDuplicate.FindDuplicate(arr);
	}

}
