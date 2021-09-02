package day_1;
import java.util.Scanner;
public class RstoDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter amount in Rs. - ");
		Scanner sc = new Scanner(System.in);
		double Rs = sc.nextDouble();
		System.out.println(Rs + " rupees in dollar = " + "$" + (0.014*Rs));
		sc.close();
	}

}
