/*
		 * Peterson Number program:
		 * A number is said to be Peterson if the sum of factorials of 
		 * each digit is equal to the number itself. 
		 * for ex: 
		 * 	Number = 145
		 * 	145 = !1 + !4 + !5
		 * 		= 1+21+120
		 * 		= 145 then its Peterson number
		 */

package NumberPrograms;

import java.util.Scanner;

public class PetersonNumber {

	// method to find factorial of number
	static int factorial(int n) {
		if (n >= 1)
			return n*factorial(n-1);
		else
			return 1;
	}// success

	public static void main(String[] args) {

		// steps to follow:
		// get input from the user
		// find factorials of each digit of given number
		// find the sum of all the final factorials
		// compare the sum with input

		// declare vars
		int input, sum = 0, temp;

		// init the Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input: ");
		input = scanner.nextInt();

		for (int i = 0; i < String.valueOf(input).length(); i++) {
			// seperate the digits
			temp = Character.digit(String.valueOf(input).charAt(i), 10);
			System.out.println("digit: " + temp);

			sum += factorial(temp);
			System.out.println("Sum: " + sum);
			
		}
		
		if(input==sum)
			System.out.println("it's peterson number");
		else
			System.out.println("it's not peterson number");

		
	}
}
