/*
File Name: switchpositive.java
Programmer: ncl
Date Created: nov. 13 2018
*/
import java.util.Scanner;

class Y
{
	public static void main (String arg[])
		{
			int number, result;
		    int num;
			Scanner nicx = new Scanner(System.in);
			System.out.println("enter number and press enter");
			number=nicx.nextInt();
			
			result=number/number;
			 
			
		switch (result)	
			{
			case 1: 
				System.out.println( "The number you entered is positive"  + (number>=0));
				break;
				System.out.println("The number you entered is negative" + (number>=0));
				break;
			default:
				System.out.println( "The number you entered is negative");
			}
			
		}
}