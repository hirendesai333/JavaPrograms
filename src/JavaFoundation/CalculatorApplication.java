package JavaFoundation;

import java.util.Scanner;

public class CalculatorApplication {

	// global variable declaration
	static int a;
	static int b;
	static int input = 0;
	static boolean flag = true;
	static String cont = "";
	static int add = 0;
	static int sub = 0;
	static int mul = 0;
	static int div = 0;
	// scanner class to get input from users
	static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		// show menu
		System.out.println("Menu");
		System.out.println("1:Addition");
		System.out.println("2:Subtraction");
		System.out.println("3:Multiplication");
		System.out.println("4:Division");

		System.out.print("\nEnter menu option: ");
		input = sc.nextInt();

		if (input > 4 || input < 1) {
			System.out.println("Please choose valid menu option");
			showMenu();
		}

		// get input from user
		System.out.print("\nEnter first input: ");
		a = sc.nextInt();

		System.out.print("Enter second input: ");
		b = sc.nextInt();
	}

	public static void main(String[] args) {
		showMenu();

		aa: do {

			switch (input) {
			case 1:
				add = a + b;
				System.out.println("Addition is:" + add);

//				System.out.println("\nDo you want to continue?: yes or no");
//				cont = sc.nextLine();
//
//				if (cont.equals("yes")) {
//					flag = true;
//				} else {
//					flag = false;
//				}
				break;

			case 2:
				sub = a - b;
				System.out.println("Subtraction is:" + sub);
				break;
			case 3:
				mul = a * b;
				System.out.println("Multiplication is:" + mul);
				break;
			case 4:
				div = a / b;
				System.out.println("Division is:" + div);
				break;
			default:
				System.out.println("Please enter valid menu option");
			}

		} while (flag == true);

	}

}
