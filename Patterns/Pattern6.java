package Patterns;

//                *
//              * *
//            * * *
//          * * * *
//        * * * * *


public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("  ");
            }
            for(int z=0;z<i+1;z++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
