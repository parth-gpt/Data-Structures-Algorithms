package Recursion.easy;

public class NSum {
    public static void main(String[] args) {
        System.out.println(sum(6, 0));
    }

    static int sum(int num, int ans)
    {
        if(num <= 0)
        {
            return ans;
        }
        ans += num;
        return sum(num-1, ans);
    }
}
