package BasicPrograms;
/*
    Fibonacci program to print series of number. where each number is 
    sum of two preceding number 
*/

public class FibonacciSeries {
	public static void main(String[] args) {
        int n;
        int n1=0,n2=1;

        for (int i=1; i<10; i++) {
            //this is what i suppose to print
            //1 = 0+1
            //2 = 1+0     
            //3 = 1+1   
            //4 = 2+1    
            //5 = 3+2
            //6 = 5+3
            //...............  
 
            n = n1+n2;
            System.out.println(n); //print fibonacci number 

            n1=n2;
            n2=n;

        }
 	}
}
