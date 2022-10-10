package BasicPrograms;
/*
    Prime number program to print only number who can be divided by 
    1 or itself.
    
    in other words remainder is not zero. Odd numbers can be prime and 2 is the only even prime
    number 
    
*/

import java.util.*;
public class PrimeNumbers {
	public static void main(String[] args){
        int n,flag=0; //variables
        
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check wheather its prime number or not?: ");
        n = sc.nextInt();

        if(isPrime(n))
            System.out.println("its prime number!");
        else
            System.out.println("its not prime number!!");

        //method 1
        //for loop to check division is zero or not
        for (int i=2; i<(n/2); i++) {
            if(n%i==0){
                System.out.println("its not prime number!");
                flag=1;
                break;
            }
        }

        //if flag is zero then its prime number
        if(flag==0)
            System.out.println("its prime number!!");

    }
	
	//method 2
    public static Boolean isPrime(int p){
        for (int i=2; i<(p/2); i++) {
            if(p%i==0)
                return false;
        }

        return true;
    }
}
