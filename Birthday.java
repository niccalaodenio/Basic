/*
Filename:  Birthday.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created: 10-01-18
*/

class Birthday                                 //the classname is depend upon your Filename
{
  public static void main(String arg[])
	{
		double Grandmother, Uncle, shoes, Money;               //declare the variables and don't forget to put a semi-colon
		Grandmother = 150;
	 	Uncle = 75;
 		shoes = 275.50;
		Money = 0;
		Money = shoes - (Grandmother + Uncle);
		
		System.out.println("Nellie need to add an amount of " + Money);
	}
}