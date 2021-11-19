package Recursion.basics;

import java.util.Arrays;

public class SumTrianglefromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arrTriangle(arr);
    }

    static void arrTriangle(int[] arr)
    {
        int[] temp = new int[arr.length - 1];
        if(arr.length>1)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                int x = arr[i] + arr[i+1];
                temp[i] = x;
            }
            arrTriangle(temp);
        }
        System.out.println(Arrays.toString(arr));
    }
}
