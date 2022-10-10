package BasicPrograms;
/*
 * 	find factorial of number: it will go as -> for ex. factorial of 5 then it's 5x4x3x2x1 = 120
 */

import java.util.*;
public class FactorialProgram {
	public static void main(String args[]) {
		int input;
		int sum = 1; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find factorial!: ");
		input = sc.nextInt();
		
		for(int i=1; i<=input; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}
}
