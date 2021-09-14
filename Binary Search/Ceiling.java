package binary_search;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element to be found - ");
        int target = sc.nextInt();
        if(target<=arr[arr.length-1])
        {
            binarySearch(arr, target);
        }
        else{
            System.out.println("Element - " + arr[0] + " has been found. At index - " + 0);
        }
    }

    static void binarySearch(int[] arr, int target)
    {
        int s = 0;
        int e = arr.length -1;
        while(s <= e)
        {
//            int mid = (s + e) / 2; may exceed the limit of int
            int mid = s + (e - s) / 2;  // better method

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
        System.out.println("Element - " + arr[s] + " has been found. At index - " + s);
    }
}
