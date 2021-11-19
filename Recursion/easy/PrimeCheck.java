package Recursion.easy;

public class PrimeCheck {
    public static void main(String[] args) {
        check(5, 1, 0);
    }

    static void check(int num, int div, int count)
    {
        if (count > 2)
        {
            System.out.println("Not Prime");
            return;
        }

        if(div>num)
        {
            System.out.println("Prime");
            return;
        }

        if (num%div == 0)
        {
            count++;
        }

        check(num, div+1, count);
    }
}
