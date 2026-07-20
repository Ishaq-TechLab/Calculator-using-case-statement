package day3;

import java.util.Scanner;

public class CalculatorUsingCaseStatements {

	public static void main(String[] args) {
		System.out.println("Enter the First Number");
		Scanner scanner = new Scanner(System.in); // Using Scanner class to get input from user
		double num1 = scanner.nextDouble();
		System.out.println(num1);

		System.out.println("Enter the Second Number");
		double num2 = scanner.nextDouble(); // 2nd input
		System.out.println(num2);
		/*
		 * scanner.nextDouble(); //3rd input scanner.nextDouble();//4th input double
		 * num4=scanner.nextDouble(); //5th input
		 * System.out.println("num4 value is"+" "+ num4);
		 */
		System.out.println("Choose an operation");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");

		int Choice = scanner.nextInt();
		System.out.println("You Chose option " + Choice);

		switch (Choice) {
		
		case 1:

			System.out.println("Your Result=" + "" + (num1 + num2));
			break;

		case 2:

			System.out.println("Your Result=" + "" + (num1 - num2));
			break;

		case 3:

			System.out.println("Your Result=" + "" + (num1 * num2));
			break;

		case 4:

			if (num2 != 0)
				System.out.println("Your Result=" + "" + (num1 / num2));

			else
				System.out.println("Error : Division by zero is not allowed.");
			break;

		default:
			System.out.println("You selected an invalid Choice");
						}

	}

}
