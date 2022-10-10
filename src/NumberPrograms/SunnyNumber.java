/*
 *  Sunny number program:
 *  A number is called a sunny number if the number next to the given number is a perfect 
 *  square. In other words, a number N will be a sunny number if N+1 is a perfect square.
 *  
 *  Suppose, we have to check if 80 is a sunny number or not.

Given, N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. 
Hence 80 is a sunny number.

Let's take another number 10.

Given, N=10 then N+1 will be 10+1=11, which is not a perfect square. 
Hence 10 is not a sunny number.

 */

package NumberPrograms;

import java.util.Scanner;
import static java.lang.Math.*;

public class SunnyNumber {

	public static void main(String[] args) {
		// steps to follow:
		// get input from the user
		// increment a digit by 1 and find that is it perfect square

		// declare the vars
		int input, count, square;
		
		// init the Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input: ");
		input = scanner.nextInt();
		
		count = input + 1;
		
		double R = Math.sqrt(count);
		System.out.println("The square root of " + count + " is " + R);
		
//		System.out.println(R % 1 == 0); //to check whether double value has decimal or no
				
		if(R % 1 == 0)
			System.out.println(input+" is sunny number");
	    else
			System.out.println(input+" is not sunny number");
		
		
	}
	
	
}
