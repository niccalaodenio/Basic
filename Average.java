/*
Filename: Average.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created:  10-24-18
*/
import java.util.Scanner;
class Average
{
  public static void main(String arg[])
	{
		 int quiz1,quiz2,quiz3,quiz4,quiz5,total_score, Average;
		 Scanner input = new Scanner(System.in);
		 System.out.print("enter first quiz and press 'enter key': ");
			quiz1 = input.nextInt();
		 System.out.print("enter second quiz and press 'enter key': ");
			quiz2 = input.nextInt();
		 System.out.print("enter third quizand press 'enter key': ");
			quiz3 = input.nextInt();
		 System.out.print("enter forth quiz and press 'enter key': ");	
			quiz4 = input.nextInt();
		 System.out.print("enter fifth quiz and press 'enter key': ");
			quiz5 = input.nextInt();
		 total_score = quiz1 + quiz2 + quiz3 + quiz4 + quiz5;
		 Average = total_score / 5;
		 
		System.out.println("the total score of five quizes are: " + total_score );
		System.out.println("the Average of five quizes are: " + Average );
	}
	
}