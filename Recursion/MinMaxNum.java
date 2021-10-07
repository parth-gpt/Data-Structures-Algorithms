package Recursion;

public class MinMaxNum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(max(arr, Integer.MIN_VALUE, 0));
        System.out.println(min(arr, Integer.MAX_VALUE, 0));
    }

    static int max(int[] arr, int maxm, int start)
    {
        if(start >= arr.length)
        {
            return maxm;
        }

        if(maxm<arr[start])
        {
            maxm = arr[start];
        }
        start++;
        return max(arr, maxm, start);
    }

    static int min(int[] arr, int minm, int start)
    {
        if(start >= arr.length)
        {
            return minm;
        }

        if(minm>arr[start])
        {
            minm = arr[start];
        }
        start++;
        return min(arr, minm, start);
    }
}
