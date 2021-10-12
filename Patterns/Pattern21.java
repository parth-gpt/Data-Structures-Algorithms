package Patterns;

//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

public class Pattern21 {
    public static void main(String[] args) {
        pattern21(5);
    }

    static void pattern21(int n)
    {
        int num = 1;
        for(int row=1;row<=n;row++)
        {
            for(int column=1;column<=row;column++)
            {
                if(num/10 == 0)
                {
                    System.out.print(num + "  ");
                }
                else{
                    System.out.print(num + " ");
                }
                num++;
            }
            System.out.println();
        }
    }
}
