/*
 *  Find minimum number from array
 */

package ArrayFoundation;

public class MinimumNumber {
	static void min(int arr[]) {
		int min = arr[0];//declare minimum var and assign first value of array to it
		
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println("Min num is:"+ min);
		
	}
	
	public static void main(String[] args) {
		int[] a = {10,20,4,3,2,9};
		min(a);
	}

}
