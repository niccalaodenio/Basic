/*
File Name: Product.java
Programmer: Nicca Laodenio
Date Created: October 24, 2018
*/
import java.util.Scanner;
class Product
  {
    public static void main(String[]args)
      {
         int No1, No2, Product;
         Scanner input = new Scanner(System.in);
         System.out.print("Input first number and press 'enter key': ");
			No1 = input.nextInt();
         System.out.print("Input second number and press 'enter key':");
			No2 = input.nextInt();
         Product = No1 * No2;
         System.out.println("The Product of two numbers:" + Product);
      }
  }