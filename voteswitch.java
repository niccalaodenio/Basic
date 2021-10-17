/*
File Name: switchvote.java
Programmer: ncl
Date Created: nov. 13 2018
*/
import java.util.Scanner;
class voteswitch
{
	public static void main (String args[])
		{
			int Age;
			System.out.println("How old are you?");
			Scanner nicx = new Scanner(System.in);
			Age=nicx.nextInt();
			
			
		   switch (Age)
			{
			case 18:
			System.out.println("Congratulation! you are qulified to vote" + (Age >= 18));
			 break;
			default:
			System.out.println("Sorry.. you're too young");
			}
	}	
	
}