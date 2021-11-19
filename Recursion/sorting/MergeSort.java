package Recursion.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0 ,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid ,arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second)
    {
        int[] mixed = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                mixed[k] = first[i];
                i++;
            }
            else{
                mixed[k] = second[j];
                j++;
            }
            k++;
        }

//        if elements still left to be added
        while(i < first.length)
        {
            mixed[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length)
        {
            mixed[k] = second[j];
            j++;
            k++;
        }

        return mixed;
    }


//    In Place
    static void mergeSortInPlace(int[] arr, int s, int e)
    {
        if(e-s == 1)
        {
            return;
        }
        int mid = s + (e-s)/2;
        mergeSortInPlace(arr, s ,mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e)
    {
        int[] mixed = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e)
        {
            if(arr[i] < arr[j])
            {
                mixed[k] = arr[i];
                i++;
            }
            else{
                mixed[k] = arr[j];
                j++;
            }
            k++;
        }

//        if elements still left to be added
        while(i < m)
        {
            mixed[k] = arr[i];
            i++;
            k++;
        }

        while(j < e)
        {
            mixed[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0;l< mixed.length;l++)
        {
            arr[s+l] = mixed[l];
        }
    }
}
