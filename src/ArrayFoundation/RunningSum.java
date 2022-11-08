/**
 * Running sum of 1-D array
 * Given an array numbers. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Example ==>
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

package ArrayFoundation;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int sum = 0, length = numbers.length;
        int[] sumArr = new int[length];

        for (int i = 0; i < length; i++) {
            sum += numbers[i];
            sumArr[i] = sum;
        }

        System.out.println("Input number: " + Arrays.toString(numbers));
        System.out.println("Output array: " + Arrays.toString(sumArr));

    }
}
