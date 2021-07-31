package dsa;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayElementPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//your array
		System.out.println("The array elements is "+Arrays.toString(arr));
	}

}
