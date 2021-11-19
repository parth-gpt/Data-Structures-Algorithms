package Recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5};
        bubbleSort(arr, 0, 1);
    }

    static void bubbleSort(int[] arr, int i, int j)
    {
        if(i == arr.length-1)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(j < arr.length-i)
        {
            if(arr[j-1] > arr[j])
            {
                swap(arr, j-1, j);
            }
            bubbleSort(arr, i , j+1);
        }
        else
        {
            bubbleSort(arr, i+1, 1);
        }
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
