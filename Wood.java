/*
Filename: Wood.java
Programmer: Nicca Laodenio (BSIT-1C)
Date Created:  
*/

class Wood
{
  public static void main(String arg[])
	{
		int firewood, used, cooking, wood_left;
		firewood = 75;  
		used = 24;
		cooking = 27;
		wood_left = firewood - (used + cooking);
		
		System.out.println("The total pieces of firewood were left:" + wood_left);
	}
}