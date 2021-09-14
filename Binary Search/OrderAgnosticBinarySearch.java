package binary_search;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element to be found - ");
        int target = sc.nextInt();
        search(arr, target);
    }
    static void search(int[] arr, int target)
    {
        int s = 0;
        int e = arr.length - 1;

        if(s>e){
            descend(arr, target);
        }
        else{
            ascend(arr, target);
        }
    }
    static void descend(int[] arr, int target){
        int s = 0;
        int e = arr.length -1;
        while(s <= e)
        {
            int mid = s + (e - s) / 2;

            if(target<arr[mid])
            {
                s = mid + 1;
            }
            else if(target>arr[mid])
            {
                e = mid - 1;
            }
            else{
                System.out.println("Element Found. At index - " + mid);
                return;
            }
        }
        System.out.println("Element doesn't exist in the given array.");
    }

    static void ascend(int[] arr, int target){
        int s = 0;
        int e = arr.length -1;
        while(s <= e)
        {
            int mid = s + (e - s) / 2;

            if(target<arr[mid])
            {
                e = mid - 1;
            }
            else if(target>arr[mid])
            {
                s = mid + 1;
            }
            else{
                System.out.println("Element Found. At index - " + mid);
                return;
            }
        }
        System.out.println("Element doesn't exist in the given array.");
    }
}
