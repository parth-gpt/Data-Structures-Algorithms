package Patterns;

//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

public class Pattern19 {
    public static void main(String[] args) {
        pattern19(5);
    }

    static void pattern19(int n)
    {
        for (int row=1;row<=2*n-1;row++)
        {
            if(row<=n)
            {
                for(int column=1;column<=row;column++)
                {
                    System.out.print("*");
                }

                for(int column = row+1;column<=2*n;column++)
                {
                    if(column > 2*n-row)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else{
                for(int column=1;column<=2*n-row;column++)
                {
                    System.out.print("*");
                }

                for(int column = 2*n-row+1;column<=2*n;column++)
                {
                    if(column > row)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
