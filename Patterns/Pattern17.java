package Patterns;

//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
//     3 2 1 2 3
//       2 1 2
//         1
public class Pattern17 {
    public static void main(String[] args) {
        pattern17(4);
    }

    static void pattern17(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            if(i<=n)
            {
                for(int j=i;j<n;j++)
                {
                    System.out.print("  ");
                }

                for(int z=i;z>=1;z--)
                {
                    System.out.print(z + " ");
                }

                for(int z=2;z<=i;z++)
                {
                    System.out.print(z + " ");
                }

                System.out.println();
            }
            else{
                for(int j=2*n-i;j<n;j++)
                {
                    System.out.print("  ");
                }

                for(int z=2*n-i;z>=1;z--)
                {
                    System.out.print(z + " ");
                }

                for(int z=2;z<=2*n-i;z++)
                {
                    System.out.print(z + " ");
                }

                System.out.println();
            }
        }
    }
}
