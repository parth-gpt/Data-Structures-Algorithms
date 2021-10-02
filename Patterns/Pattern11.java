package Patterns;

//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }

    static void pattern11(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int z=0;z<n-i;z++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
