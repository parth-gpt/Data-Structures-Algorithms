package day_1;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter temperature in celcius - ");
		Scanner sc = new Scanner(System.in);
		int temp_c = sc.nextInt();
		int temp_f = ((temp_c*9) / 5) + 32;
		
		System.out.println("Temperature in farenheit - " + temp_f);
		sc.close();
	}

}
