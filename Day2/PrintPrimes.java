package day_2;

import java.util.Scanner;

public class PrintPrimes {

    static boolean isPrime(int num)
    {
        int count = 0;
        for(int i =1 ;i<=num;i++)
        {
            if(num%i ==0)
            {
                if(i==1 || i==num)
                {
                    count++;
                }
                else {
                    count++;
                }
            }
        }
        if(count == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static void printPrimes(int num1, int num2)
    {
        for (int i = num1;i<num2;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        printPrimes(num1,num2);
    }
}
