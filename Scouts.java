/*
Filename:   Scouts.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created:  x
*/

class Scouts
{
  public static void main(String arg[])
	{
		int boys, girls,  packs_consumed, packs_left;
		boys = 90;
		girls = 75;
		packs_consumed = 86;
		packs_left = (boys + girls) - packs_consumed;
		
		System.out.println("The total tetrapacks that were left: " + packs_left );
	}
}