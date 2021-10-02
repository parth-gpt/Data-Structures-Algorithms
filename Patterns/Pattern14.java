package Patterns;

//       *********
//        *     *
//         *   *
//          * *
//           *

public class Pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }

    static void pattern14(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j<n-1;j++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=2*n-i;k++)
            {
                if(i==1 || (k==1 || k==2*n-2*i+1))
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
