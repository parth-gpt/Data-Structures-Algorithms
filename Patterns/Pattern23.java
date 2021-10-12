package Patterns;

//                 *      *
//               *   *  *   *
//             *      *      *

public class Pattern23 {
    public static void main(String[] args) {
        pattern23(9);
    }

    static void pattern23(int n)
    {
        for(int row=1;row<=n/3;row++)
        {
            for(int column=1;column<=n;column++)
            {
                if((column+row)%4==0 && row!=2)
                {
                    System.out.print("*");
                }
                else{
                    if(row!=2)
                    {
                        System.out.print(" ");
                    }
                }
                if(row==2)
                {
                    if((column+row)%2==0)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
