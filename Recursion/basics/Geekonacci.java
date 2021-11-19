package Recursion.basics;

public class Geekonacci {
    public static void main(String[] args) {
        System.out.println(gik(1,3, 2, 4));
    }
    static int gik(int a, int b, int c, int n)
    {
        if(n==1)
        {
            return a;
        }

        if(n==2)
        {
            return b;
        }

        if(n==3)
        {
            return c;
        }
        return gik(a, b, c, n-1) + gik(a, b, c, n-2) + gik(a, b, c, n-3);
    }
}

