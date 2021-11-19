package Recursion.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(insertionSort(arr, 0)));
    }

    static int[] insertionSort(int[] arr, int i)
    {
        int n = arr.length;
        if(i>n-2)
        {
            return arr;
        }

        for(int j=i+1;j>0;j--)
        {
            if(arr[j]<arr[j-1])
            {
                swap(arr, j-1, j);
            }
            else{
                break;
            }
        }

        return insertionSort(arr, i+1);
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
