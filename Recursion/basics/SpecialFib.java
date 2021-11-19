package Recursion.basics;
import java.lang.reflect.Method;
import java.util.*;

public class SpecialFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(fib2(a, b, n));
        }
    }
//    Method 1
    static int fib1(int a, int b, int n)
    {
        if(n==0)
        {
            return a;
        }

        if(n==1)
        {
            return b;
        }

        return fib1(a, b, n-1) ^ fib1(a, b, n-2);
    }

//    Method 2
    static int fib2(int a, int b, int n)
    {
        if(n==0)
        {
            return a;
        }

        if(n==1)
        {
            return b;
        }
        if (n==2)
        {
            return a^b;
        }

        return fib2(n%3, a, b);
    }
}
