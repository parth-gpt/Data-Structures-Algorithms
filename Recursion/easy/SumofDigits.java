package Recursion.easy;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(dig_sum(1342));
    }

    static int dig_sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return dig_sum(n/10) + n%10;
    }
}
