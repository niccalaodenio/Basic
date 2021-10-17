/*
Filename: Exchange.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created:  
*/

import java.util.Scanner;
class Exchange
{
  public static void main(String arg[])
	{
		int num1, num2, nicx;
		 Scanner input= new Scanner(System.in);
		 System.out.print("enter number 1 and press 'enter key':");
			num1 = input.nextInt();
		 System.out.print("enter number 2 and press 'enter key' :");
			num2 = input.nextInt();
		nicx = num1;
		num1 = num2;
		num2 = nicx; 
		
		System.out.println("num1:" + num1 );
		System.out.println("num2:" + num2 );
	}
}
