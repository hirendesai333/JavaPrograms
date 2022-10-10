/**
 * Neon Number program:
 * A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
 */

package NumberPrograms;

import java.util.Scanner;

public class NeonNumber {
    /*
     * steps to follow:
     * get the input from the user
     * find square of that input digit
     * then calculate sum of each digit of square
     * compare final sum with input if both matches it means given input is neon number
     */

    //scanner class to read the input from the user
    static Scanner scanner = new Scanner(System.in);
    static int input, sum, remainder,reverse;
    static int square;

    //main method
    public static void main(String[] args) {
        //ask for the input and store to input
        System.out.print("Enter the number to check whether its neon or not: ");
        input = scanner.nextInt();

        //square of the input
        square = (int) Math.pow(input,2);
        System.out.println(square);

        //check if input is not null
        while(square!=0) {
            remainder = square%10; //get the remainder of input AKA last digit of input
            sum += remainder;
            square /= 10; //divide input by 10 AKA remove last digit from input
        }

        if (input==sum)
            System.out.println(input+" is NEON number");
        else
            System.out.println(input+" is not NEON number");

    }

}
