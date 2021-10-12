package Patterns;

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

public class Pattern22 {
    public static void main(String[] args) {
        pattern22(5);
    }

    static void pattern22(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=row;column++)
            {
                if(row%2!=0)
                {
                    if(column%2!=0)
                    {
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                else{
                    if(column%2!=0)
                    {
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
