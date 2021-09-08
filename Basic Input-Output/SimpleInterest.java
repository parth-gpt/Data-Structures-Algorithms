package day_1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle - ");
		double P = sc.nextDouble();
		System.out.println("Enter Rate - ");
		double R = sc.nextDouble();
		System.out.println("Enter Time - ");
		float T = sc.nextFloat();
		System.out.println("Simple Interest - " + ((P*R*T)/100));
		sc.close();

	}

}
