package dsa;

import java.util.Arrays;
//import java.util.Scanner;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    	
    	nums[] = {2,7,11,15};
    	target = 18;
    	
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==target-nums[i]){
                    return new int[] {i, j}; 
                }
            }
        }
        return null;
        
    }
}

//public class TwoSum {
//	
//	public static void main(String[] args) {
//		
//		public int[] twoSum(int[] arr, int target) {
//			// TODO Auto-generated method stub
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter an array size");
//			int size = sc.nextInt();
//			arr = new int[size];
//			System.out.println("Enter the array elements");
//			for(int i=0; i<arr.length; i++) {
//				arr[i] = sc.nextInt();
//			}
//			System.out.println("Enter the target value which is sum of two array numbers ");
//			target = sc.nextInt();
//			System.out.println("Your array is "+Arrays.toString(arr));
//			System.out.println("Your target is "+target);
//			
//			for(int i=0; i<arr.length; i++) {
//				for(int j=i+1; j<arr.length; j++) {
//					if(arr[j] == target - arr[i]) {
//						return new int[] {i, j};
//					}
//				}
//			}
//			return null;
//			
//		}
//		
//	}
//
//}
