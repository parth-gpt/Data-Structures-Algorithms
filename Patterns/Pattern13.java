package Patterns;

//         *
//        * *
//       *   *
//      *     *
//     *********

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
    }

    static void pattern13(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<2*i;k++)
            {
                if(i == n || (k==1 || k==2*i-1))
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
