package dsa;

import java.util.Scanner;

public class StarPrint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row you want: ");
		int row = sc.nextInt();
		
		for(int i = 1; i<= row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
