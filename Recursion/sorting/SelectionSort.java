package Recursion.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5};
        selectionSort(arr, 0);
    }

    static void selectionSort(int[] arr, int i)
    {
        if(i == arr.length-1)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int last = arr.length-1-i;
        int maxIndex = maxElIndex(arr, 0 , last, 0);
        swap(arr, maxIndex, last);
        selectionSort(arr, i+1);
    }

    static int maxElIndex(int[] arr, int start, int end, int max)
    {
        if(start<=end)
        {
            if(arr[max]<arr[start])
            {
                max = start;
            }
            return maxElIndex(arr, start+1, end, max);
        }
        else{
            return max;
        }
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
