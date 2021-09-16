package binary_search;
import java.util.*;
public class TimesRotated {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 9, 10};
        times(nums);
    }
    static void times(int[] nums)
    {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int pivot = arr[arr.length - 1];

        List<Integer> al = new ArrayList<Integer>();
        for (int num : nums)
        {
            al.add(num);
        }
        int indexPivot = al.indexOf(pivot);

        if(indexPivot == nums.length-1)
        {
            System.out.println("Rotated 0 times.");
        }
        else{
            System.out.println("Rotated " + (indexPivot + 1) + " times.");
        }
    }
}
