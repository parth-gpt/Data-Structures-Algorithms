package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }


    static int[] selectionSort(int[] arr)
    {
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            int last = n-i-1;
            int maxIndex = maxElement(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }


    static int maxElement(int[] arr, int start, int end)
    {
        int max = start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                max = i;
            }
        }
        return max;
    }


    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
