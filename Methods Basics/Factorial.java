package day_2;

import java.util.Scanner;

public class Factorial {

    static void Factorial(int num)
    {
        int ans = 1;
        for (int i=1;i<=num;i++)
        {
            ans = ans*i;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Factorial(num);
    }
}
