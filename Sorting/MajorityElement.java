package Sorting;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

        static int majorityElement(int[] nums) {
            Arrays.sort(nums);

            int count = 1;
            int ans = 0;
            int maxm = 0;

            for(int i=1;i<nums.length;i++)
            {
                if(nums[i] == nums[i-1])
                {
                    count++;
                    if(count>maxm)
                    {
                        ans = nums[i-1];
                    }
                    maxm = Math.max(count, maxm);
                }
                else{
                    count = 1;
                }
            }
            return ans;
        }
}
