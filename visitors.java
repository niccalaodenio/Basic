/*
Filename: visitors.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created: 10-01-18 
*/

class visitors
{
  public static void main(String arg[])
	{
		int cupcake, distributed, set_aside, left_for_the_vis;
		cupcake = 60;
		distributed = 39;
		set_aside = 7;
		left_for_the_vis = cupcake - ( distributed + set_aside );

		System.out.println(" the cupcake that left to the visitors are : " + left_for_the_vis );
	}
}