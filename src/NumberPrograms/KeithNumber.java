/*
 * 	Keith Number (or repfigit number) Program 
 * 	
 * refer to below image link:
 * https://static.javatpoint.com/core/images/keith-number-in-java.png 
 */

package NumberPrograms;

import java.util.*;

public class KeithNumber {

	// user-defined function that checks if the given number is Keith or not
	static boolean isKeith(int x) {
		// List stores all the digits of the X
		ArrayList<Integer> terms = new ArrayList<Integer>();
		
		// n denotes the number of digits
		int temp = x, n = 0;
		
		// executes until the condition becomes false
		while (temp > 0) {
			// determines the last digit of the number and add it to the List
			terms.add(temp % 10);
			// removes the last digit
			temp = temp / 10;
			// increments the number of digits (n) by 1
			n++;
		}
		
		// reverse the List
		Collections.reverse(terms);
		
		int next_term = 0, i = n;
		// finds next term for the series
		// loop executes until the condition returns true
		while (next_term < x) {
			next_term = 0;
			// next term is the sum of previous n terms (it depends on number of digits the
			// number has)
			for (int j = 1; j <= n; j++)
				next_term = next_term + terms.get(i - j);
			terms.add(next_term);
			i++;
		}
		
		// when the control comes out of the while loop, there will be two conditions:
		// either next_term will be equal to x or greater than x
		// if equal, the given number is Keith, else not
		return (next_term == x);
	}

	// driver code
	public static void main(String[] args) {
		// calling the user-defined method inside the if statement and print the result
		// accordingly
		if (isKeith(19))
			System.out.println("Yes, the given number is a Keith number.");
		else
			System.out.println("No, the given number is not a Keith number.");
		if (isKeith(742))
			System.out.println("Yes, the given number is a Keith number.");
		else
			System.out.println("No, the given number is not a Keith number.");
		if (isKeith(4578))
			System.out.println("Yes, the given number is a Keith number.");
		else
			System.out.println("No, the given number is not a Keith number.");
	}

	/*
	 * // Steps to Find Keith Number // // 1: Read or initialize a number (X). // 2:
	 * Separate each digit from the given number (X). // 3: Add all the n-digits. It
	 * gives the next term of the series. // 4: Again, add the last n-terms of the
	 * series to find the next term. // 5: Repeat step 4 until we get the term the
	 * same as the number we have taken. // The program must stop if the value
	 * computed is greater than the input number.
	 * 
	 * // init the vars public static int n1; public static int n2; public static
	 * int n3;
	 * 
	 * public static void main(String[] args) { int input; int sum = 0; int length =
	 * 0;
	 * 
	 * // init the Scanner class Scanner sc = new Scanner(System.in);
	 * System.out.print("Enter the number: "); input = sc.nextInt();
	 * 
	 * String numString = String.valueOf(input); length = numString.length();
	 * 
	 * if (length == 2) { n1 = 0; n2 = Integer.parseInt(numString.substring(0, 1));
	 * n3 = Integer.parseInt(numString.substring(1, 2));
	 * 
	 * System.out.println(n1); System.out.println(n2); System.out.println(n3); }
	 * 
	 * if (length == 3) { n1 = Integer.parseInt(numString.substring(0, 1)); n2 =
	 * Integer.parseInt(numString.substring(1, 2)); n3 =
	 * Integer.parseInt(numString.substring(2, 3));
	 * 
	 * System.out.println(n1); System.out.println(n2); System.out.println(n3); }
	 * 
	 * // for loop for test purpose System.out.println("For loop for test purpose");
	 * 
	 * for (int i = 0; i < 10; i++) { sum = n1 + n2 + n3;
	 * 
	 * System.out.println(i + ": " + sum);
	 * 
	 * n1 = n2; n2 = n3; n3 = sum;
	 * 
	 * if (input == sum) { System.out.println(input + " is Keith Number!"); break; }
	 * // success
	 * 
	 * }
	 * 
	 * // do while will be used // do { // sum = n1 + n2 + n3; // //
	 * System.out.println("sum: " + sum); // // n1 = n2; // n2 = n3; // n3 = sum; //
	 * // } while (input != sum); // // if(input==sum) // System.out.println(input +
	 * " is Keith Number!");
	 * 
	 * }
	 */

}
