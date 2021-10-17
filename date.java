import java.util.Scanner;
class date
{
	public static void main(String args[])
	{
		int date,year;
		String month;
		Scanner input = new Scanner(System.in);

		System.out.println("\nEnter your birth month: ");
		month=input.nextLine();
		System.out.println("\nEnter your date of birth: ");
		date=input.nextInt();
		System.out.println("\nEnter your birth year: ");
		year=input.nextInt();
		
		
		if ( "month" == "1")
		 
		System.out.println("January");
		else if ( "month" == "2")
			System.out.println("February");
		else if ("month" == "3")
			System.out.println("March");
	}
}