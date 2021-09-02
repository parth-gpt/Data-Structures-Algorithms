package day_1;
import java.util.*;
public class CountingOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long i = sc.nextLong();
		String s = String.valueOf(i);
		char arr[] = new char[s.length()];
		arr = s.toCharArray();
		System.out.println("Find Occurence of (0-9) - ");
		char a = sc.next().trim().charAt(0);
		int count = 0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j] == a)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
