package Recursion.arrays;

public class SortCheck {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4};
        check(arr, 0);
    }

    static void check(int[] arr, int i)
    {
        if(i == arr.length-1)
        {
            System.out.println("Sorted");
        }
        else if (arr[i] <= arr[i + 1])
        {
            check(arr, i + 1);
        }
        else{
            System.out.println("Not Sorted");
        }

    }
}
