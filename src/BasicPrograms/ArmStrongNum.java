/*
 * Armstrong number program or a narcissistic number program: 
 * A number is thought of as an Armstrong number if the sum of 
 * its own digits raised to the power number of digits gives the 
 * number itself
 */

package BasicPrograms;
import java.util.*;

public class ArmStrongNum {
	public static void main(String[] args) {
		//steps to follow : 
		//get the input from user
		//count the power of the digits or iow: count the digits 
		//seperate the digits 
		//give power to each digits and sum up 
		
		//declaring variables 
		int input, power, temp=0, sword=0;
		String num = ""; 
		
		//init Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to check whether it's armstrong num or no?: ");
		//get the input from user
		input = sc.nextInt();//success
		
		//store the input into string number
		num = String.valueOf(input);//success
		
		//count the number of digits in variable
		power = String.valueOf(input).length();//success 

		//for loop to go through each and every CHAR of digit input
		for(int i=0;i<power;i++) {
			
			temp = Character.digit(num.charAt(i), 10);
//			System.out.println(temp);
			
			temp = (int) Math.pow(temp,power);
//			System.out.println(temp);
			
			sword += temp;
			
		}
	
		if(input == sword)
			System.out.println(input+" number is armstrong number");
		else
			System.out.println(input+" is not armstrong number");
		
	}
}
