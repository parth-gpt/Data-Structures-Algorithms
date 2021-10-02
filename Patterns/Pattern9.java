package Patterns;

//   * * * * * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j<n;j++)
            {
                System.out.print("  ");
            }
            for(int z=0;z<2*(n-i)-1;z++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
