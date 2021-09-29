package Patterns;

//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j<n;j++)
            {
                System.out.print("  ");
            }
            for(int z=0;z<n-i;z++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
