package Recursion.arrays;

public class BSRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        System.out.println( search(arr, 0, arr.length-1, 2));
    }

    static int search(int[] arr, int s, int e, int target)
    {
        if(s>e)
        {
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target)
        {
            return m;
        }

        if(arr[s] <= arr[m])
        {
            if(target >= arr[s] && target <= arr[m])
            {
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        else{
            if(target >= m && target <= e)
            {
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }
        return search(arr, s, e, target);
    }
}
