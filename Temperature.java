/*
Filename: Temperature.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created:  10-24-18
*/
import java.util.Scanner;
class Temperature
{
  public static void main(String arg[])
	{
		 int Temperature, F, C;
		 Scanner input = new Scanner(System.in);
		 System.out.print("enter fahrenheit");
		 F = input.nextInt();
		 C = (9/ 5) * (F - 32);
		 System.out.println("the value of Temperature of F to C is:" + C );
	}
}