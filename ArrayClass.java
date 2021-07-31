package dsa;
import java.util.Arrays;

public class ArrayClass {
	public static void main(String args[]) {
		int arr[][] = {{1,2,3},{2,3,4}};
		System.out.println("tostring "+Arrays.toString(arr));
		System.out.println("asList "+Arrays.asList(arr));
		System.out.println("deepstring "+Arrays.deepToString(arr));
	}

}
