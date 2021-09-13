package linear_search;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println("Number of numbers with even digits - " + findNumbers(nums));
    }
    static int digits(int number)
    {
        return (int)(Math.log10(number)) + 1;
    }
    static int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            int count = digits(nums[i]);
            if(count%2 == 0)
            {
                ans++;
            }
        }
        return ans;
    }
}
