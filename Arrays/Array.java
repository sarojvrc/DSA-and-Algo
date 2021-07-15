package dsa;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array size");
        int in=sc.nextInt();

        int arr[]=new int[in];
        int temp=0;
        int avg=0;

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<arr.length;i++)
        {
            temp=temp+arr[i];
            
        }
	}

}
