package BasicPrograms;
/*
 * A string is called a palindrome string if the reverse of that string is the 
 * same as the original string e.g. LOL
 */

import java.util.*;
public class Palimdrome {
	public static void main(String[] args) {
		/*
		 * Steps to follow:
		 * - get the string from user
		 * - reverse that string into temp variable
		 * - compare both string if it matches then its palindrome string else not!
		 */

//		String originalStr, reverse = "";
//		
//		System.out.print("Enter String: ");
//		
//		//Scanner class to get input string from usr
//		Scanner scanner = new Scanner(System.in);
//		originalStr = scanner.nextLine();
//		
//		//length of original string
//		int length = originalStr.length();
//		
//		for ( int i = length - 1; i >= 0; i-- ) //int i = 3-1=2; loop will run till its zero; i-- //2 1 0
//	         reverse += originalStr.charAt(i);  // 
		
		int original = 345;
		int reverse = 0;
		int temp = original;
		while(original!=0) {
			int remainder = original%10;
			reverse = (reverse*10)+remainder;
			original /= 10; 
		}
		System.out.println(reverse);
		 
		if(temp == reverse)
			System.out.println("it's palindrome!");
		else
			System.out.println("Input is not palindrome!");
		
	}
}
