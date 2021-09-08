package day_1;
import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean command = true;
		while(command == true)
		{
			System.out.println("Enter 2 no.s - ");
			Scanner sc = new Scanner(System.in);
			Double a = sc.nextDouble();
			Double b = sc.nextDouble();
			System.out.println("Enter operator - ");
			char op = sc.next().charAt(0);
			if(op == '+')
			{
				System.out.println("Sum = " + (a+b));
			}
			else if(op == '-')
			{
				System.out.println("Difference = " + (a-b));
			}
			else if(op == 'x')
			{
				System.out.println("Multiplication = " + (a*b));
			}
			else if(op =='/')
			{
				System.out.println("Division = " + (a/b));
			}
			System.out.println("Press X or x to exit or press any other key to continue...");
			char ch = sc.next().trim().charAt(0);
			if(ch == 'X' || ch == 'x')
			{
				command = false;
			}
			else
			{
				command = true;
			}
		}
	}

}
