package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class FindElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The  arry is "+Arrays.toString(arr));
		System.out.print("Enter the no to search from array ");
		int no = sc.nextInt();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == no) {
				count++;
			}
		}
		if(count > 0) {
			System.out.println("Number "+no+" found "+ count+" times");
		}else {
			System.out.println(no+" not found from the array");
		}
	}

}
