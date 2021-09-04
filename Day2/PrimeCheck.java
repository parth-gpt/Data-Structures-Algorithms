package day_2;

import java.util.Scanner;

public class PrimeCheck {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num))
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
