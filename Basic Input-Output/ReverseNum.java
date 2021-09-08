package day_1;
import java.util.*;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long i = sc.nextLong();
		String s = String.valueOf(i);
		StringBuilder reverse = new StringBuilder();
		reverse.append(s);
		reverse.reverse();
		System.out.println(reverse);
		sc.close();
	}

}
