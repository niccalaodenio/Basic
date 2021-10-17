/*
File Name: Difference.java
Programmer: Laodenio Nicca C.
Date Created: October 24, 2018
*/
import java.util.Scanner;
class Difference
  {
    public static void main(String[]args)
      {
         int No1, No2, Difference;
         Scanner input = new Scanner(System.in);
         System.out.print("Input first number and press 'enter key':");
         	No1 = input.nextInt();
         System.out.print("Input second number and press 'enter key':");
         	No2 = input.nextInt();
         Difference = No1 - No2;
         
	 System.out.println("The Difference of two numbers:" + Difference);
      }
  }