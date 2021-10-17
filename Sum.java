/*
Filename: Sum.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created:  
*/

import java.util.Scanner;
class Sum 
{
  public static void main(String arg[])
	{
		 int No1, No2, Sum;
		 Scanner input= new Scanner(System.in);
		 System.out.print("enter first number and press 'enter key':");
			No1 = input.nextInt();
		 System.out.print("enter second number and press 'enter key':");
			No2 = input.nextInt();
		 Sum = No1 + No2;
		 
		System.out.println("the sum of the two numbers are:" + Sum );
	}
}