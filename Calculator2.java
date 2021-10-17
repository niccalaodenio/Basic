/*
File Name:Calculator.java
Programmer:Nicca Laodenio
Date Created: 
*/
import java.util.Scanner;
class Calculator2
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

		if (op == "+") {
			ans=num1+num2;
			System.out.println("\nThe Sum of the two numbers is equals to: \n" + ans);
		}
		else if (op == "-"){
			ans=num1-num2;
			System.out.println("\nThe Difference of the two numbers is equals to: \n" + ans );
		}
		else if (op == "*"){
			ans=num1*num2;
			System.out.println("\nThe Product of the two numbers is equals to: \n" + ans ); 
		}
		else if (op =="/"){
			ans=num1/num2;
			System.out.println("\nThe Quotient of the two numbers is equals to: \n" + ans);
		}
		else if (op == "%"){
			ans=num1%num2;
			System.out.println("\nThe Remainder of the two numbers is equals to: \n" + ans);
		}else{	
			System.out.println("\n***Syntax Error***");}
				
	}
} 