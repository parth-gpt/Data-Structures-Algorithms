package BinarySearch;

public class SpecialNumArray {
    public static void main(String[] args) {
        int[] arr = {1,0,0,6,4,9};
        System.out.println(specialArray(arr));
    }

    public static int specialArray(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]>= n)
            {
                count++;
            }
        }

        if(count == n)
        {
            return n;
        }
        else{
            for(int i=0;i<n;i++)
            {
                count = 0;
                for(int j=0;j<n;j++)
                {
                    if(nums[j] >= nums[i])
                    {
                        count++;
                    }
                }
                if(count == nums[i])
                {
                    return nums[i];
                }
            }

            for(int i=0;i<n;i++)
            {
                count = 0;
                for(int j=0;j<n;j++)
                {
                    if(nums[j] >= i)
                    {
                        count++;
                    }
                }
                if(count == i)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
