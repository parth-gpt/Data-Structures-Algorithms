package Recursion.ques;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        System.out.println(combinationSum(arr, 8));
    }

    static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(0, arr, target, ans, new ArrayList<Integer>());

        return ans;
    }

    static void sum( int i, int[] arr, int target, List<List<Integer>> ans, List<Integer> insideList){
        if (i == arr.length)
        {
            if (target == 0)
            {
                List<Integer> newInside = new ArrayList<>(insideList);
                ans.add(newInside);
            }
            return;
        }

        if (arr[i]<=target)
        {
            insideList.add(arr[i]);
//        Taking the element
            sum(i, arr, target-arr[i], ans, insideList);

//        Backtracking
            insideList.remove(insideList.size()-1);
        }

        //        Not taking element
        sum(i+1, arr, target, ans, insideList);


    }
}
