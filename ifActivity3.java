/*
File Name: ifActivity3.java
Programmer: ncl
Date Created: nov. 13 2018
*/
import java.util.Scanner;
class ifActivity3
{
	public static void main (String args[])
	   {
			int firstnum, scndnum, sum, guess;
			System.out.println("Enter 1st number then press enter");
			Scanner nicx = new Scanner(System.in);
			firstnum=nicx.nextInt();
			System.out.println("Enter 2nd number then press enter");
			scndnum=nicx.nextInt();
			System.out.println("Enter your guess sum");
			guess=nicx.nextInt();
			sum = firstnum + scndnum; 
			
            if  ( sum == guess)
				System.out.println("You are correct");
			else if ( sum != guess)
				System.out.println("Sorry you are wrong");
		}
}