package Patterns;

//          1
//        1   1
//      1   2   1
//    1   3   3   1
//  1   4   6   4   1

public class Pattern16 {
    public static void main(String[] args) {
        pattern16(5);
    }

    static void pattern16(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }

           int num = (int)(Math.pow(11,i));
            while(num>0)
            {
                int last = num%10;
                System.out.print(last + " ");
                num /= 10;
            }
            System.out.println();
        }
    }
}
