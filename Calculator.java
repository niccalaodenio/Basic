/*
File Name: Calculator.java
Programmer: Jose Paul S. Pederio
Date Created: October 24, 2018
*/
import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
		{
		Double num1, num2, ans;
		String op;
		Scanner input = new Scanner(System.in);

		System.out.println("\nEnter First Number : ");
		num1=input.nextDouble();
		System.out.println("Enter Second Number : ");
		num2=input.nextDouble();
		
		Scanner operator = new Scanner(System.in);
		System.out.println("Input Operation : ");
		op=operator.next();

		switch (op)
		{
		case "+":
			System.out.println("\nThe Sum of the Two Numbers is Equals to: \n" + (num1 + num2));
			break;

		case "-":
			System.out.println("\nThe Difference of the Two Numbers is Equals to: \n" + (num1 - num2));
			break;

		case "*":
			System.out.println("\nThe Product of the Two Numbers is Equals to: \n" + (num1 * num2)); 
			break;

		case "/":
			System.out.println("\nThe Quotient of the Two Numbers is Equals to: \n" + (num1 / num2));
			break;
		
		case "%":
			System.out.println("\nThe Remainder of the Two Numbers is Equals to: \n" + (num1 % num2));
			break;
		
		default:
			System.out.println("\n***Syntax Error***");
		}		
	}
} 