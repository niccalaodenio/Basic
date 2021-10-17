/*Filename: Activity2.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created:  
*/

import java.util.Scanner;
class Activity
{
  public static void main(String arg[])
	{
		double work_perhr=125.50, salary, net_take, tax=.12, deducted;
		 Scanner input= new Scanner(System.in);
		 System.out.print("enter the total hours; ");
			hours = input.nextInt();
		salary = work_perhr * hours;
		net_take = salary * tax;
		deducted = salary - net_take;
		
		System.out.println("salary every month is a total of: " + salary );
		System.out.println("the 12% of salary for tax payment is: " + net_take );
		System.out.println("the salary deducted: " + deducted);
	}
}