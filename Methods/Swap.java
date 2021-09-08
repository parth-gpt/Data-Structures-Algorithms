package day_2;
import java.util.*;
public class Swap {

	static void swap(int a, int b)
	{
		int test = a;
		a=b;
		b=test;
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		swap(a,b);
	}

}
