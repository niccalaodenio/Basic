/*
File Name: Remainder.java
Programmer: Nicca Laodenio
Date Created: October 24, 2018
*/
import java.util.Scanner;
class Remainder
  {
    public static void main(String[]args)
      {
         int No1, No2, Remainder;
         Scanner input = new Scanner(System.in);
         System.out.print("Input first number and press 'enter key':");
			No1 = input.nextInt();
         System.out.print("Input second number and press 'enter key':");
			No2 = input.nextInt();
         Remainder = No1 % No2;
         System.out.println("The Remainder of two numbers:" + Remainder);
      }
  }