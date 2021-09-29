package Patterns;

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n)
    {
        for(int i=0;i<2*n-1;i++)
        {
            if(i<=n-1)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("* ");
                }
            }
            else{
                for(int j=2*n-i-1;j>0;j--)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
