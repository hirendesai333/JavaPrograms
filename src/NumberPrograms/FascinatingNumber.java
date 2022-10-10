/*
 * Fascinating number program:
 * 
 * Multiplying a number by two and three separately, the number obtained by writing the 
 * results obtained with the given number will be called a fascinating number. 
 * If the result obtained after concatenation contains all digits from 1 to 9, exactly once.
 * 
 * for instance: 
 * In other words, we can also say that a number (n) may be a fascinating number 
 * if it satisfies the following two conditions:
 * If the given number is a 3 or more than three-digit
 * If the value getting after concatenation contains all digits from 1 to 9, exactly once
 * 
 */

package NumberPrograms;

import java.util.*;

public class FascinatingNumber {
	//still have a doubt 
	// steps to follow:
	// get the input from the User
	// check whether the given input contains 3 or more digits or not
	// if so, multiply that input with 2 Nd 3. Store both results into seperate
	// variables
	// Then, perform concatenation of given input and both generated variables.
	// if that value contains all the digits 1 to 9, only once then it is
	// Fascinating number

	public static void main(String[] args) {
		// declare vars
		int input, v1, v2, length;
		String concat = "";
		boolean found = true;

		// init Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		input = sc.nextInt();

		// check if given input's length is 3 digits or more to continue
		length = String.valueOf(input).length();
		System.out.println("Length of the input: " + length);

		// if length matches
		if (length >= 3) {
			v1 = input * 2;
			v2 = input * 3;

			System.out.println("Value 1 multiplied by 2: " + v1);
			System.out.println("Value 2 multiplied by 3: " + v2);

			concat = input + String.valueOf(v1) + v2;
			System.out.println("Concatenation " + concat);

			// checks all digits from 1 to 9 are present or not
			for (char c = '1'; c <= '9'; c++) {
				int count = 0;
				// loop counts the frequency of each digit
				for (int i = 0; i < concat.length(); i++) {
					char ch = concat.charAt(i);
					// compares the character of concatstr with i
					if (ch == c)
						// increments the count by 1 if the specified condition returns true
						count++;
				}
				// returns true if any of the condition returns true
				if (count > 1 || count == 0) {
					found = false;
					break;
				}
			}

			if (found)
				System.out.println(input + " is a fascinating number.");
			else
				System.out.println(input + " is not a fascinating number.");
			
		}//end of parent if condition

	}
}
