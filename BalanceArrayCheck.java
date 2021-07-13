package dsa;

public class BalanceArrayCheck {
	public static void main(String args[]) {
		int arr[] = {2,1,2,2,1,1,2,1,2,1};
		int count1=0, count2=0, globalCount=0;
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
