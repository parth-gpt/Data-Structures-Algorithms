package Recursion.easy;

public class Productof2Nums {
    public static void main(String[] args) {
        System.out.println(product(5, 2, 0));
    }

    static int product(int num1, int num2, int ans)
    {
        int minm = Math.min(num1, num2);
        int maxm = Math.max(num1, num2);

        if (minm<=0)
        {
            return ans;
        }

        minm -= 1;
        ans += maxm;
        return product(maxm, minm, ans);

    }
}
