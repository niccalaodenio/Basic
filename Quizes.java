/*
Filename: Quizes.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created:  10-24-18
*/
import java.util.Scanner;
class Quizes
{
  public static void main(String arg[])
	{
		 int quiz1,quiz2,quiz3,quiz4,quiz5,total_score, Average;
		 Scanner input = new Scanner(System.in);
		 System.out.print("enter first quiz");
			quiz1 = input.nextInt();
		 System.out.print("enter second quiz");
			quiz2 = input.nextInt();
		 System.out.print("enter third quiz");
			quiz3 = input.nextInt();
		 System.out.print("enter forth quiz");	
			quiz4 = input.nextInt();
		 System.out.print("enter fifth quiz");
			quiz5 = input.nextInt();
		 total_score = quiz1 + quiz2 + quiz3 + quiz4 + quiz5;
		 Average = total_score / 5;
		 
		System.out.println("the total score of five quizes are: " + total_score );
		System.out.println("the Average of five quizes are: " + Average );
	}
}