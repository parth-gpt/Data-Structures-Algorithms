package Sorting;
import java.util.*;

public class Intersectionof2Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    static int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else{
                ans.add(nums1[i]);
                j++;
            }
        }

        int[] answer = new int[ans.size()];

        for(int z=0;z<ans.size();z++)
        {
            answer[z] = ans.get(z);
        }
        return answer;
    }
}
