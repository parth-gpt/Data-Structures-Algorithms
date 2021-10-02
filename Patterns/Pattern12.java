package Patterns;

//       * * * * *
//        * * * *
//         * * *
//          * *
//           *
//           *
//          * *
//         * * *
//        * * * *
//       * * * * *

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern12(int n)
    {
        for(int i=0;i<=2*n;i++)
        {
            if(i<n)
            {
                for(int j=n-i-1;j<n;j++)
                {
                    System.out.print(" ");
                }
                for(int z=0;z<n-i;z++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else if(i>n)
            {
                for(int j=0;j<2*n-i+1;j++)
                {
                    System.out.print(" ");
                }
                for(int z=0;z<i-n;z++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
