package Recursion.easy;

public class Count0s {
    public static void main(String[] args) {
        System.out.println(count2(1030300, 0));
    }

//    Method 1
    static int count = 0;
    static void count1(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem = n%10;
        if (rem == 0)
        {
            count++;
        }
        count1(n/10);
    }

//    Method 2
    static int count2(int n, int count)
    {
        if(n==0)
        {
            return count;
        }
        if(n%10 == 0)
        {
            return count2(n/10, count+1);
        }
        else{
            return count2(n/10, count);
        }
    }
}
