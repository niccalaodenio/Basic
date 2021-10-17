/*
File Name: Calculator2.java
Programmer: ncl
Date Created: October 24, 2018
*/
import java.util.Scanner;
class simplecalculator
{
	public static void main(String args[])
	{
		int num1, num2, Result;
		char op;
		Scanner nicx = new Scanner(System.in);
		System.out.println("Please Enter First Number : ");
		num1=nicx.nextInt();
		System.out.println("Please Enter Second Number : ");
		num2=nicx.nextInt();
		
		System.out.println("Input Operator to be use: ");
		op=nicx.next().charAt(0);            	//if your going to use "char" put also this ".charAt"
		
		
		if (op == '+') 
		{						   			   //single quote is applicable in computational character.
			Result = num1+num2;	
		}
		else if (op == '-')
		{
			Result = num1-num2;
		}
		else if (op == '*')
		{
			Result = num1*num2;
		}
		else if (op == '/')
		{
			Result = num1/num2;
		}
		else
		{
			Result = num1%num2;
		}
			
		System.out.println("The Result of two numbers is: " + Result );
			
	}			
			
}