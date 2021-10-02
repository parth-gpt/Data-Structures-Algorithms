package Patterns;

//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }

    static void pattern10(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int z=0;z<i+1;z++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
