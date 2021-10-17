/*
File Name: Dollar.java
Programmer: Nicca Laodenio
Date Created: October 24, 2018
*/
import java.util.Scanner;
class Dollar
  {
    public static void main(String[]args)
      {
         double Peso = 53.77, dollar, equivalent;
         Scanner input = new Scanner(System.in);
         System.out.print("Input the amount of dollar and press 'enter key': ");
			dollar = input.nextInt();
		equivalent = dollar * Peso;
         System.out.println("The Equivalent of dollar to peso is: " + equivalent);
      }
  }