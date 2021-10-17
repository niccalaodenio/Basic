/*
File Name: switchpositive.java
Programmer: ncl
Date Created: nov. 13 2018
*/
import java.util.Scanner;

class new1
{
	public static void main (String arg[])
		{
			int number, result;
			Scanner nicx = new Scanner(System.in);
			System.out.println("enter number and press enter");
			number=nicx.nextInt();
			
			result=(number>=0)? 1:2; 
			result=(number>=0)? 3:4;
			
			
		switch (result)	
			{
			case 1: 
				System.out.println("The number you entered is positive");
				break;
			case 2: 
				System.out.println("The number you entered is negative");
				break;
			case 3:
			System.out.println("The number you entered is negative");
			default:
				System.out.println("wrong syntax");
				break;
			}
			
		}
}