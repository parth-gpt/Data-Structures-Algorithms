package day_1;
import java.util.*;
public class Greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Name - ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("Hello " + name + ". Good Evening!");
		sc.close();
	}

}
