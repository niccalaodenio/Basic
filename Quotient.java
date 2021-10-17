/*
File Name: Quotient.java
Programmer: Nicca Laodenio
Date Created: October 24, 2018
*/
import java.util.Scanner;
class Quotient
  {
    public static void main(String[]args)
      {
         int No1, No2, Quotient;
         Scanner input = new Scanner(System.in);
         System.out.print("Input first number and press 'enter key':");
			No1 = input.nextInt();
         System.out.print("Input second numberand press 'enter key':");
			No2 = input.nextInt();
         Quotient = No1 / No2;
         
		 System.out.println("The Quotient of two numbers:" + Quotient);
      }
  }