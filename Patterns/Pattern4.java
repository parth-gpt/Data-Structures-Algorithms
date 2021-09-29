package Patterns;

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

public class Pattern4 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
