package Patterns;

//        * * * *
//        *     *
//        *     *
//        *     *
//        * * * *

public class Pattern20 {
    public static void main(String[] args) {
        pattern20(5);
    }

    static void pattern20(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<n;column++)
            {
                if(row==1 || row==n || column==1 || column==n-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
