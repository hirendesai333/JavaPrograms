// Reverse a number in java

package NumberPrograms;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		//3 steps to follow:
		//find remainder of original number
		//store (reverse*10)+remainder to reverse number
		//divide the original number by 10
		
		//declare variables
		int input, remainder, reverse = 0;
		
		//init Scanner class
		Scanner sc = new Scanner(System.in);
		
		//get the input from user
		System.out.print("Enter input to reverse the number:");
		input = sc.nextInt();
		
		//check if input is not null
		while(input!=0) {
			remainder = input%10; //get the remainder of input
			reverse = (reverse*10)+remainder; //apply (reverse*10)+remainder
			input /= 10; //divide inpute by 10
		}
		
		System.out.println(reverse);
		
	}
}
