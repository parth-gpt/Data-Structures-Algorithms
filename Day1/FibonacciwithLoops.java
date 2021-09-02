package day_1;
import java.util.*;
public class FibonacciwithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int ans = 0;
		for(int i=0;i<n-1;i++)
		{
			ans = a + b;
			a = b;
			b = ans;
		}
		System.out.println(ans);
		sc.close();
	}

}
