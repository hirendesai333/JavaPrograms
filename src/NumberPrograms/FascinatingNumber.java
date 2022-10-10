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
		int input, v1, v2, length = 0, freq = 0;
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

			concat = String.valueOf(input) + String.valueOf(v1) + String.valueOf(v2);
			System.out.println("Concatenation " + concat);

//			con = Integer.parseInt(concat);//not needed

			// checks all digits from 1 to 9 are present or not
			for (char c = '1'; c <= '9'; c++) {
				int count = 0;
				// loop counts the frequency of each digit
				for (int i = 0; i < concat.length(); i++) {
					char ch = concat.charAt(i);
					// compares the character of concatstr with i
					if (ch == c)
						// incerments the count by 1 if the specified condition returns true
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

		// own method but not working Nd no logic behind this.
//			for(int i=1;i<=9;i++) {
//				if(concat.charAt(i-1) == '1' ||
//						concat.charAt(i-1) == '2' || 
//								concat.charAt(i-1) == '3' || 
//										concat.charAt(i-1) == '4' || 
//												concat.charAt(i-1) == '5' || 
//														concat.charAt(i-1) == '6' || 
//																concat.charAt(i-1) =='7' || 
//																		concat.charAt(i-1) == '8' || 
//																		concat.charAt(i-1) == '9') {
//					
//					freq = i;
//					System.out.println("Frequency: "+freq);
//
//					
//					//code to check whether final obtainer result contains all the digits once
//					System.out.println("Contains all the digits");
//					
//				}
//				else
//					System.out.println("does not Contains all the digits");
//
//			}
//
//		}else System.out.println("Please enter 3 or more digits number to continue");

	}
}
