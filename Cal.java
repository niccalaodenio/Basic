 import java.util.Scanner;
class Cal
{
	public static void main(String args[])
		{
		Double num1, num2, ans;
		String op;
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter First Number : ");
		num1=input.nextDouble();
		System.out.println("Enter Second Number : ");
		num2=input.nextDouble();
		
		Scanner operator = new Scanner(System.in);
		System.out.println("Input Operation : ");
		op=operator.next();

		if (op == "+") {
			ans=num1+num2;
			System.out.println("The Sum of the Two Numbers is Equals to: " + ans );
		}
		else if (op =="-"){
			ans=num1-num2;
			System.out.println("The Difference of the Two Numbers is Equals to: " + ans );
		}
		else if (op =="*"){
			ans=num1*num2;
			System.out.println("The Product of the Two Numbers is Equals to: " + ans ); 
		}
		else if (op =="/"){
			ans=num1/num2;
			System.out.println("The Quotient of the Two Numbers is Equals to: " + ans);
		}
		else if (op =="%"){
			ans=num1%num2;
			System.out.println("The Remainder of the Two Numbers is Equals to: " + ans);
		
		}else{	
			System.out.println("***Syntax Error***");
			}			
	}
} 