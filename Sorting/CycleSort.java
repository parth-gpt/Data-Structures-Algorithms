package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }

    static int[] cycleSort(int[] arr)
    {
        int i=0;
        while(i< arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i] == arr[correct])
            {
                i++;
            }
            else{
                swap(arr, correct, i);
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
