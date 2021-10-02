package Patterns;

//        *
//       * *
//      *   *
//     *     *
//    *       *
//     *     *
//      *   *
//       * *
//        *

public class Pattern15 {
    public static void main(String[] args) {
        pattern15(5);
    }

    static void pattern15(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            if(i<=n)
            {
                for(int j=i;j<n;j++)
                {
                    System.out.print(" ");
                }

                for(int k=1;k<2*i;k++)
                {
                    if(k==1 || k==2*i-1)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else{
                for(int j=2*n-i;j<n;j++)
                {
                    System.out.print(" ");
                }

                for(int k=1;k<=2*n-i+4;k++)
                {
                    if(k==1 || k==4*n-2*i-1)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
