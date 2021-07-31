package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayFinds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elem..");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("the array is "+Arrays.toString(arr));
		System.out.println("Enter the search element");
		int n = sc.nextInt();
		
		int count = 0; 
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n) {
				count++;
			}
		}
		
		if(count > 0) {
			System.out.println("Total count found "+count+" times");
		}else {
			System.out.println("not found");
		}
	}

}
