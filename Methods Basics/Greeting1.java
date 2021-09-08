package day_2;
import java.util.*;
public class Greeting1 {
	
	static void greeting(String name) {
		System.out.println("Hello " +name+ ". Good Afternoon!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		greeting(name);
	}

}
