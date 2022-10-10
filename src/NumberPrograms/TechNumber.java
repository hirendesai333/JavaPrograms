/*
 * 
 * Tech Number program:
 * 
 * A number is called a tech number if the given number has an even number of digits 
 * and the number can be divided exactly into two parts from the middle. After equally 
 * dividing the number, sum up the numbers and find the square of the sum. If we get the 
 * number itself as square, the given number is a tech number, else, not a tech number.
 */

package NumberPrograms;
import java.util.Scanner;

public class TechNumber {
	//steps to follow:
	//get the input from user
	//find whether given input is even digits or no 
	//if so-> divide input into 2 parts  
	//then-> sum up both parts and find square of it 
	//compare o/p with given input
	
	public static void main(String[] args) {
		//declare vars
		int input, sum=0, square=0, length, p1, p2;
		String s1,s2;
		
		//init Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Ener input: ");
		input = sc.nextInt();
		
		String temp = String.valueOf(input);
		length = temp.length();
		
		//condition to check given num is even or odd
		if(length%2==0) {
			System.out.println("it's Even Number");

			//Primary method to divide number into 2 parts
			//determines the first half of the given number  
			p1 = input % (int) Math.pow(10, length / 2);  
			//determines the second half of the given number  
			p2 = input / (int) Math.pow(10, length / 2);  
			
			System.out.println("Part 1: "+p1);
			System.out.println("Part 2: "+p2);

			sum = p1+p2;
			System.out.println("Sum: "+sum);
			
			square = (int) Math.pow(sum, 2);
			System.out.println("Square: "+square);
			
			if(input==square)
				System.out.println("It's tech number");
			else
				System.out.println("It's not tech number");

		}
		else
			System.out.println("Please Enter Even number to find out Is it tech number or no");
		
	}
	
}
