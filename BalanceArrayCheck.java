package dsa;

import java.util.Scanner;

public class BalanceArrayCheck {
	public static void main(String args[]) {
		//int arr[] = {2,1,2,2,1,1,2,1,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int count1=0, count2=0, globalCount=0;
		
		System.out.println("Enter the array elements only in 1 or 2: ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				count1 = count1 + 1;
			}else {
				count2 = count2+1;
			}
			
			if(count1 == count2) {
				globalCount = globalCount+1;
			}
		}
		System.out.println("The balanced patteren is "+globalCount);
	}
}
