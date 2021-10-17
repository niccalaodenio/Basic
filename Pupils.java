/*
filename: Pupils.java
Programmer: NCL
*/
class Pupils
{
 public static void main(String arg[])
	{
		int grade_four, grade_five, number_of_pupils, seeds, total_seeds;
		grade_four = 211;
		grade_five = 175;
		seeds = 75;
		number_of_pupils =  grade_four + grade_five;
		total_seeds = number_of_pupils + seeds;

		System.out.println("The number of pupils are " + number_of_pupils);
		System.out.println("While the total number of seeds they bring are " + total_seeds);
	}
}