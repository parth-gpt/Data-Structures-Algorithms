package Recursion.strings;
import java.util.*;
public class SubSetXOR {
    public static void main(String[] args) {
        int[] nums = {1, 3};

            List<List<Integer>> ans = subset(nums);
            int sum = 0;
            for(List<Integer> list:ans)
            {
                if(list.size() == 0)
                {
                    sum += 0;
                }
                else if(list.size() == 1)
                {
                    sum += list.get(0);
                }
                else{
                    int xor = 0;
                    for(int num:list)
                    {
                        xor = num ^ xor;
                    }
                    sum += xor;
                }
            }

        System.out.println(sum);
    }

    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: arr)
        {
            int n = outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                List<Integer> revInternal = new ArrayList<>(internal);
                Collections.reverse(revInternal);

                if(outer.contains(internal) || outer.contains(revInternal))
                {
                    continue;
                }
                outer.add(internal);
            }
        }

        return outer;
    }
}
