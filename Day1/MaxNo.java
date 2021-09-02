package day_1;

import java.util.Scanner;

public class MaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 no.s - ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b)
		{
			System.out.println("Max of " + a + " & " + b + " = " + a);
		}
		else
		{
			System.out.println("Max of " + a + " & " + b + " = " + b);
		}
		sc.close();

	}

}
