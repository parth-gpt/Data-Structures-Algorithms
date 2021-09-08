package day_3;

public class SwapElementsArray {
    static void swap(int[] arr, int a, int b)
    {
        int test = arr[a];
        arr[a] = arr[b];
        arr[b] = test;

        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,10,4,2,1};
        swap(arr,1,3);
    }
}
