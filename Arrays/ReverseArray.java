package day_3;

import java.util.Arrays;

public class ReverseArray {
    static void swap(int[] arr, int a, int b)
    {
        int test = arr[a];
        arr[a] = arr[b];
        arr[b] = test;
    }
    public static void main(String[] args) {
        int[] arr = {5,10,4,2,1};

        int i =0;
        int j = arr.length-1;
        while(i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
