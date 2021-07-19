package dsa;
import java.util.Scanner;

public class StringCompare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd String");
		String str2 = sc.nextLine();
		
		boolean compare = str1.equals(str2);
		System.out.println("You inputted for String 1 is "+str1);
		System.out.println("You inputted for String 2 is "+str2);
		if(str1 == str2) {
			//System.out.println(str1 + " and "+str2+" both are equal");
			System.out.println(str1 + " and "+str2+" both are equal");
		}
		if(compare ==  true) {
			System.out.println("Compare returns true");
		}else {
			System.out.println("Compare returns false");
		}
	}

}
