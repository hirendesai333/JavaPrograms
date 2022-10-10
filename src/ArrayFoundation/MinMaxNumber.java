/*
 *  Find minimum number from array
 */

package ArrayFoundation;

public class MinMaxNumber {
	static int[] numbers = {10,20,4,3,2,9};
	static int min,max;

	static void min(int[] arr) {
		min = arr[0];//declare minimum var and assign first value of array to it
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println("Smallest number of array is : "+ min);
	}

	static void max(int[] arr) {
		max = arr[0];//declare maximum var and assign first value of array to it
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Largest number of array is : "+ max);
	}
	
	public static void main(String[] args) {
		min(numbers);
		max(numbers);
	}

}
